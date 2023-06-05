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


public class EventManagerTestCase {
	private EventManagerSistema eventManager;
	@Mock private ArticuloCientifico art1;
	@Mock private ArticuloCientifico art2;
	@Mock private ArticuloCientifico art3;
	@Mock private FiltroCriterioArticulo fil1;
	@Mock private FiltroCriterioArticulo fil2;
	@Mock private FiltroCriterioArticulo fil3;
	@Mock private MiembroDeLaboratorio obs1;
	@Mock private MiembroDeLaboratorio obs2;
	
	@BeforeEach
	public void setUp() {
		this.eventManager = new EventManagerSistema();
		this.eventManager.agregarObserver(obs1);
		this.art1 = mock(ArticuloCientifico.class);
		this.art2 = mock(ArticuloCientifico.class);
		this.art3 = mock(ArticuloCientifico.class);
		this.fil1 = mock(FiltroCriterioArticulo.class);
		this.fil2 = mock(FiltroCriterioArticulo.class);
		this.fil3 = mock(FiltroCriterioArticulo.class);
		this.obs1 = mock(MiembroDeLaboratorio.class);
	}
	
	@Test
	public void testSiElArticuloCumpleConTodosLosFiltrosDelObserverSeLeNotifica() {
		when(obs1.getListaDeFiltros()).thenReturn(Arrays.asList(fil1, fil2, fil3));
		when(fil1.cumpleFiltro(art1)).thenReturn(true);
		when(fil2.cumpleFiltro(art1)).thenReturn(true);
		when(fil3.cumpleFiltro(art1)).thenReturn(true);
		this.eventManager.notificarSiCorrespondeA(obs1, art1);
		verify(obs1, times(1)).update();
	}
	
	@Test
	public void testSiElArticuloNoCumpleConTodosLosFiltrosDelObserverNoSeNotifica() {
		when(obs1.getListaDeFiltros()).thenReturn(Arrays.asList(fil1, fil2, fil3));
		when(fil1.cumpleFiltro(art1)).thenReturn(true);
		when(fil2.cumpleFiltro(art1)).thenReturn(false);
		when(fil3.cumpleFiltro(art1)).thenReturn(true);
		this.eventManager.notificarSiCorrespondeA(obs1, art1);
		verify(obs1, times(0)).update();
	}
}
