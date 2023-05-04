package ar.edu.unq.po2.tpComposite.ejWarcraft;
import ar.edu.unq.po2.tp3.Punto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class IngenieroTestCase {
	private Ingeniero ingeniero;
	private Tablero tablero;
	
	@BeforeEach
	public void setUp() {
		this.tablero = new Tablero(new ArrayList<Punto>(Arrays.asList(new Punto(0,0), new Punto(0,1), new Punto(1,0), new Punto(1,1))));
		this.ingeniero = new Ingeniero(new Punto(0,0), 10, this.tablero);
	}
	
	@Test
	public void testAgregaUnaLajaSiNoHayCuandoSeCrea() {
		Ingeniero ing = new Ingeniero(new Punto(0,0), 1, this.tablero);
		assertTrue(ing.hayLajaDondeEsta());
	}
	
	@Test
	public void testCuandoSeMueveElIngenieroUnaUbicacionCambiaSuUbicacionYDejaLajasEnElCamino() {
		this.ingeniero.moverA(new Punto(1,1));
		assertTrue(new Punto(1,1).equals(this.ingeniero.ubicacionActual()));
		assertTrue(this.ingeniero.hayLajaDondeEsta());
	}
	
	
}
