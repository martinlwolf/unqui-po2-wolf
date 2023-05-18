package ar.edu.unq.po2.tpComposite.ejShapeShifter;
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

public class ObjetoShifterTestCase {
	@Mock private IShapeShifter puro1;
	@Mock private IShapeShifter puro2;
	@Mock private IShapeShifter puro3;
	@Mock private IShapeShifter mixto1;
	@Mock private IShapeShifter mixto2;
	
	@BeforeEach
	public void setUp() {
		this.puro1 = new ObjetoShifter(1);
		this.puro2 = mock(ObjetoShifter.class);
		this.puro3 = mock(ObjetoShifter.class);
		this.mixto2 = mock(ObjetoShifterCompuesto.class);
	}
	
	@Test 
	public void testSi1PuroComponeAOtroSeCreaUnCompuesto() {
		List<Integer> values= Arrays.asList(1, 2);
		when(this.puro2.values()).thenReturn(Arrays.asList(2));
		assertEquals(values, this.puro1.compose(puro2).values());
	}
	
	@Test
	public void testSi1PuroSeComponeAOtroCompuestoElValueEsElCorrecto() {
		List<Integer> values= Arrays.asList(1, 3, 4);
		when(this.puro2.values()).thenReturn(Arrays.asList(3));
		when(this.puro3.values()).thenReturn(Arrays.asList(4));
		this.mixto1 = new ObjetoShifterCompuesto(puro2, puro3);
		assertEquals(values, this.puro1.compose(mixto1).values());
	}
	
	@Test
	public void testCuandoMandoFlatAUnCompuestoMeDaElValorCorrecto() {
		List<IShapeShifter> listaShifter = Arrays.asList(this.puro1, this.puro2, this.puro3);
		ObjetoShifterCompuesto comp= new ObjetoShifterCompuesto(listaShifter);
		when(this.puro2.flat()).thenReturn(puro2);
		when(this.puro3.flat()).thenReturn(puro3);
		this.mixto1 = new ObjetoShifterCompuesto(puro2, puro3);
		assertEquals(comp.values(), this.puro1.compose(mixto1).flat().values());
	}
	
	@Test
	public void testCuandoPidoElDeepestMeDaElCorrecto() {
		when(this.puro2.deepest()).thenReturn(0);
		when(this.puro3.deepest()).thenReturn(0);
		this.mixto1 = new ObjetoShifterCompuesto(puro2, puro3);
		ObjetoShifterCompuesto comp= new ObjetoShifterCompuesto(this.puro1, this.mixto1);
		assertEquals(2, comp.deepest());
	}
}
