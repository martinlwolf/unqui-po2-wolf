package ar.edu.unq.po2.tpObserver;
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


public class SistemaDeReferenciasTestCase {
	private SistemaDeReferencias sistema;
	@Mock private ArticuloCientifico art1;
	@Mock private EventManagerSistema eventManager;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new SistemaDeReferencias();
		this.art1 = mock(ArticuloCientifico.class);
		this.eventManager = mock(EventManagerSistema.class);
	}
	
	@Test
	public void testCuandoSeAgregaUnArticuloAumentaLaCantidadDeArticulosYElEventManagerNotifica() {
		this.sistema.setEventManager(eventManager);
		this.sistema.agregarArticulo(art1);
		assertEquals(1, this.sistema.cantidadDeArticulos());
		verify(this.eventManager, times(1)).notificarObservers(art1);
	}
}
