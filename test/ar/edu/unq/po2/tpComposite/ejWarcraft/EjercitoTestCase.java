package ar.edu.unq.po2.tpComposite.ejWarcraft;
import ar.edu.unq.po2.tp3.Punto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class EjercitoTestCase {
	@Mock private Soldado ingeniero1;
	@Mock private Soldado caballero1;
	@Mock private Soldado ejercito2;
	private Ejercito ejercito1;
	
	@BeforeEach
	public void setUp() {
		ejercito1 = new Ejercito(new Punto(1,1));
		ingeniero1 = mock(Ingeniero.class);
		caballero1 = mock(Caballero.class);
		ejercito2 = mock(Ejercito.class);
	}
	
	@Test
	public void testSeAgregan3Soldados() {
		ejercito1.agregarSoldado(ingeniero1);
		ejercito1.agregarSoldado(caballero1);
		ejercito1.agregarSoldado(ejercito2);
		assertEquals(3, ejercito1.cantidadDeSoldados());
		verify(ingeniero1, times(1)).moverA(ejercito1.ubicacionActual());
		verify(caballero1, times(1)).moverA(ejercito1.ubicacionActual());
		verify(ejercito2, times(1)).moverA(ejercito1.ubicacionActual());
	}
	
	@Test
	public void testCuandoSeMueveSeCambiaLaUbicacionDelEjercitoYTodosSusSoldados() {
		ejercito1.agregarSoldado(ingeniero1);
		ejercito1.agregarSoldado(caballero1);
		ejercito1.agregarSoldado(ejercito2);
		ejercito1.moverA(new Punto(5,5));
		when(ingeniero1.ubicacionActual()).thenReturn(ejercito1.ubicacionActual());
		when(caballero1.ubicacionActual()).thenReturn(ejercito1.ubicacionActual());
		when(ejercito2.ubicacionActual()).thenReturn(ejercito1.ubicacionActual());
		assertTrue(new Punto(5,5).equals(ejercito1.ubicacionActual()));
		assertTrue(ejercito1.ubicacionActual().equals(ejercito1.soldados().get(0).ubicacionActual()));
		assertTrue(ejercito1.ubicacionActual().equals(ejercito1.soldados().get(1).ubicacionActual()));
		assertTrue(ejercito1.ubicacionActual().equals(ejercito1.soldados().get(2).ubicacionActual()));
		verify(ingeniero1, times(1)).moverA(ejercito1.ubicacionActual());
		verify(caballero1, times(1)).moverA(ejercito1.ubicacionActual());
		verify(ejercito2, times(1)).moverA(ejercito1.ubicacionActual());
	}
	
	
}
