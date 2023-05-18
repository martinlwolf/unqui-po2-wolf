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

public class ReproductorTestCase {
	private Reproductor reproductor;
	
	@BeforeEach
	public void setUp() {
		this.reproductor = new Reproductor();
	}
	
	@Test
	public void testCuandoSeCreaElReproductorElEstadoEsStop() {
		assertTrue(this.reproductor.getEstado().esStop());
	}
	
	@Test
	public void testCuandoSePonePlayElEstadoEsPlay() {
		this.reproductor.play();
		assertTrue(this.reproductor.getEstado().esPlay());
	}
	
	/*faltan tests pero el codigo esta completo*/
}
