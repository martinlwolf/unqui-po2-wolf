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


public class FiltroTestCase {
	private FiltroCriterioArticulo fil1;
	 @Mock private ArticuloCientifico art1;
	 
	 @BeforeEach
	public void setUp() {
		this.fil1 = new FiltroCriterioArticulo("titulo", "smalltalk");
		this.art1 = mock(ArticuloCientifico.class);
	}
	
	@Test
	public void testSeCumpleElFiltro() {
		when(this.art1.getCampo(this.fil1.getCampo())).thenReturn("smalltalk");
		assertTrue(this.fil1.cumpleFiltro(art1));
	}
}
