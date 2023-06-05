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


public class SistemaObserverTestCase {
	private ServidorEncuentros servEnc;
	private AppMovil app;
	@Mock private Encuentro encuentro;
	
	@BeforeEach
	public void setUp() {
		this.servEnc = new ServidorEncuentros();
		this.app = new AppMovil();
		this.encuentro = mock(Encuentro.class);
	}
	
	@Test
	public void testServidorCumpleCondicion() {
		this.servEnc.setDeportesDePreferencia(Arrays.asList("futbol", "tenis", "basket"));
		when(this.encuentro.getDeporte()).thenReturn("futbol");
		assertTrue(this.servEnc.cumpleCondicionParaNotificar(encuentro));
	}
	
	@Test
	public void testAppCumpleCondicionDeDeporte() {
		this.app.setDeportesDePreferencia(Arrays.asList("futbol", "tenis", "basket"));
		when(this.encuentro.getDeporte()).thenReturn("tenis");
		assertTrue(this.app.cumpleCondicionParaNotificar(encuentro));
	}
	
	@Test
	public void testAppCumpleCondicionDeContrincantes() {
		this.app.setContrincantesDeInteres(Arrays.asList("futbol"));
		when(this.encuentro.getContricantes()).thenReturn(Arrays.asList("futbol", "tenis", "basket"));
		assertTrue(this.app.cumpleCondicionParaNotificar(encuentro));
	}
}
