package ar.edu.unq.po2.tpTestDoubles;

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

public class PokerStatusTestCaseConMock {
	
	private PokerStatus pokerStatus;
	private List<Carta> mano;
	private List<Carta> mano2;
	private Palo palo;
	@Mock private Carta carta1;
	@Mock private Carta carta2;
	@Mock private Carta carta3;
	@Mock private Carta carta4;
	@Mock private Carta carta5;
	@Mock private Carta carta6;
	@Mock private Carta carta7;
	@Mock private Carta carta8;
	@Mock private Carta carta9;
	@Mock private Carta carta10;
	
	@BeforeEach
	public void setUp() {
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
		carta6 = mock(Carta.class);
		carta7 = mock(Carta.class);
		carta8 = mock(Carta.class);
		carta9 = mock(Carta.class);
		carta10 = mock(Carta.class);
		mano = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		mano2 = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		
		pokerStatus = new PokerStatus();
	}
	
	@Test
	public void testPoquerVerdadero() {
		when(carta1.hacePokerEn(mano)).thenReturn(true);
		pokerStatus.verificarPoker(mano);
		assertTrue(pokerStatus.getJugadaActual().equals("Poker"));
		verify(carta1, times(1)).hacePokerEn(mano);
	}
	
	@Test
	public void testTrioVerdadero() {
		when(carta1.haceTrioEn(mano)).thenReturn(true);
		 mano.get(0).setValor("7");
		 pokerStatus.verificarTrio(mano);
		assertTrue(pokerStatus.getJugadaActual().equals("Trio"));
		verify(carta1, times(1)).haceTrioEn(mano);
	}
	
	@Test
	public void testColorVerdadero() {
		when(carta1.haceColorEn(mano)).thenReturn(true);
		pokerStatus.verificarColor(mano);
		assertTrue(pokerStatus.getJugadaActual().equals("Color"));
		verify(carta1, times(1)).haceColorEn(mano);
	}
	
	@Test
	public void testSiEsTrioDevuelveStringTrio() {
		when(carta1.haceTrioEn(mano)).thenReturn(true);
		assertTrue(pokerStatus.verificar(mano).equals("Trio"));
		verify(carta1, times(1)).haceColorEn(mano);
		verify(carta1, times(1)).hacePokerEn(mano);
		verify(carta1, times(1)).haceTrioEn(mano);
	}
	
	@Test
	public void testSiEsPokerDevuelveStringPoker() {
		when(carta1.hacePokerEn(mano)).thenReturn(true);
		assertTrue(pokerStatus.verificar(mano).equals("Poker"));
		verify(carta1, times(1)).haceColorEn(mano);
		verify(carta1, times(1)).hacePokerEn(mano);
		verify(carta1, times(1)).haceTrioEn(mano);
	}
	
	@Test
	public void testSiEsColorDevuelveStringColor() {
		when(carta1.haceColorEn(mano)).thenReturn(true);
		assertTrue(pokerStatus.verificar(mano).equals("Color"));
		verify(carta1, times(1)).haceColorEn(mano);
		verify(carta1, times(1)).hacePokerEn(mano);
		verify(carta1, times(1)).haceTrioEn(mano);
	}
	
	@Test
	public void testLaPrimerCartaTieneMayorValorQueLaSegunda() {
		when(carta4.valorNumerico()).thenReturn(10);
		when(carta5.valorNumerico()).thenReturn(5);
		assertTrue(pokerStatus.laCarta_TieneMayorValorQue(carta4, carta5));
	}
	
	@Test
	public void testGanadorEntre2ManosUnaConPokerOtraConColor() {
		assertTrue(pokerStatus.ganadorEntre(mano, mano2).equals(mano));
	}
	
	@Test
	public void testPuntajeDeJugadasDeUnPoker() {
		when(carta1.hacePokerEn(mano)).thenReturn(true);
		assertEquals(3, pokerStatus.puntajeDeJugadasDe(mano));
	}
}
