package ar.edu.unq.po2.tpMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class EmpleadoTestCase {
	private ETemporario tempo;
	private EPlanta planta;
	private EPasante pasante;
	
	@BeforeEach
	public void setUp() {
		this.tempo = new ETemporario(1, false, 10);
		this.planta = new EPlanta(2, false, 10);
		this.pasante = new EPasante(1, false, 100);
	}
	
	@Test
	public void testCuandoPidoELSueldoAlTemporarioYTieneUnHijoDaBien() {
		assertEquals(1000.5, this.tempo.sueldo());
	}
	
	@Test
	public void testCuandoPidoELSueldoAPlantaYTiene2HijosDaBien() {
		assertEquals(2871, this.planta.sueldo());
	}
	
	@Test
	public void testCuandoPidoELSueldoAPasanteCon100HorasDaBien() {
		assertEquals(3480, this.pasante.sueldo());
	}
}
