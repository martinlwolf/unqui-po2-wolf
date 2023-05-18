package ar.edu.unq.po2.tpState;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class MaquinaTestCase {
	private Maquina maquina;
	
	@BeforeEach
	public void setUp() {
		this.maquina = new Maquina();
	}
	
	@Test
	public void testCuandoSeCreaUnaMaquinaNuevaElEstadoEsSinFichas() {
		assertTrue(this.maquina.estaSinFichas());
	}
	
	@Test
	public void testCuandoSePresionaElBotonDeLaMaquinaYNoTieneFichasSePideQueSeIngresenFichas() {
		assertEquals("insert coin", this.maquina.presionarBoton());
	}
	
	@Test
	public void testCuandoSeIngresaUnaFichaElEstadoCambiaA1Jugador() {
		this.maquina.ingresarFicha();
		assertTrue(this.maquina.estaCon1Ficha());
	}
	
	@Test
	public void testCuandoSePresionaElBotonDeLaMaquinaYElEstadoEs1JugadorElJuegoComienzaPara1() {
		this.maquina.ingresarFicha();
		assertEquals("comienza juego 1 jugador", this.maquina.presionarBoton());
	}
	
	@Test
	public void testCuandoSeIngresaUnaFichaElEstadoCambiaA2Jugadores() {
		this.maquina.ingresarFicha();
		assertTrue(this.maquina.estaCon1Ficha());
	}
	
	@Test
	public void testCuandoSePresionaElBotonDeLaMaquinaYElEstadoEs2JugadoresElJuegoComienzaPara2() {
		this.maquina.ingresarFicha();
		this.maquina.ingresarFicha();
		assertEquals("comienza juego 2 jugadores", this.maquina.presionarBoton());
	}
	
}
