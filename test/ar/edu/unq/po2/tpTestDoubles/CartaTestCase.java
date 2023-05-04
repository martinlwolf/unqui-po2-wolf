package ar.edu.unq.po2.tpTestDoubles;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class CartaTestCase {
	private Carta carta;
	private Palo palo;
	@Mock private Carta carta2;
	@Mock private Carta carta3;
	@Mock private Carta carta4;
	@Mock private Carta carta5;
	private List<Carta> mano;
	
	@BeforeEach
	public void setUp() {
		
		carta = new Carta("2", Palo.P);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		mano = Arrays.asList(carta, carta2, carta3, carta4, carta5);
	}
	
	public void testSiPidoElValorDeLaCartaMeLoDevuelve() {
		assertTrue("J".equals(carta.getValor()));
	}
	
	public void testSiPidoElPaloDeLaCartaMeLoDevuelve() {
		assertTrue(carta.getPalo().equals(Palo.P));
	}
	
	@Test
	public void testValorDeCartaParaComparar() {
		assertTrue(carta.valorNumerico() == 1);
	}
	
	@Test
	public void testHacePokerEn() {
		when(carta2.getValor()).thenReturn("2");
		when(carta3.getValor()).thenReturn("2");
		when(carta4.getValor()).thenReturn("2");
		when(carta5.getValor()).thenReturn("3");
		assertTrue(carta.hacePokerEn(mano));
		verify(carta2, times(1)).getValor();
		verify(carta3, times(1)).getValor();
		verify(carta4, times(1)).getValor();
		verify(carta5, times(1)).getValor();
		verify(carta2, never()).getPalo();
		verify(carta3, never()).getPalo();
		verify(carta4, never()).getPalo();
		verify(carta5, never()).getPalo();
	}
}
