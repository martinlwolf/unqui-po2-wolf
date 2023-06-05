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


public class EventManagerEncuentrosTestCase {
	private EventManagerEncuentros eventManager;
	@Mock private SistemaObserver servidorEncuentros;
	@Mock private SistemaObserver appMovil;
	@Mock private Encuentro enc1;
	
	@BeforeEach
	public void setUp() {
		this.eventManager = new EventManagerEncuentros();
		this.servidorEncuentros = mock(ServidorEncuentros.class);
		this.appMovil = mock(AppMovil.class);
		this.enc1 = mock(Encuentro.class);
		
	}
	
	@Test
	public void testCuandoNotificoSeLePreguntaPorLaCondicionALosObservers() {
		this.eventManager.agregarObserver(servidorEncuentros);
		this.eventManager.agregarObserver(appMovil);
		this.eventManager.notificarObservers(this.enc1);
		assertEquals(2, this.eventManager.getObservers().size());
		verify(this.servidorEncuentros, times(1)).cumpleCondicionParaNotificar(enc1);
		verify(this.appMovil, times(1)).cumpleCondicionParaNotificar(enc1);
	}
	
	@Test
	public void testCuandoLaCondicionDaVerdaderaSeLeEnviaElUpdateAlObserver() {
		this.eventManager.agregarObserver(servidorEncuentros);
		when(this.servidorEncuentros.cumpleCondicionParaNotificar(enc1)).thenReturn(true);
		this.eventManager.notificarSiCorrespondeA(servidorEncuentros, enc1);
		verify(this.servidorEncuentros, times(1)).update(enc1);
	}
}
