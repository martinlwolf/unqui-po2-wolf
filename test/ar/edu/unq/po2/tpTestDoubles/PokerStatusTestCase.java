package ar.edu.unq.po2.tpTestDoubles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PokerStatusTestCase {
	private PokerStatus pokerStatus;
	private List<Carta> mano;
	private List<Carta> mano2;
	private Palo palo;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	
	@BeforeEach
	public void setUp() {
		carta1 = new Carta("J", Palo.P);
		carta2 = new Carta("J", Palo.C);
		carta3 = new Carta("J", Palo.T);
		carta4 = new Carta("J", Palo.D);
		carta5 = new Carta("5", Palo.P);
		carta6 = new Carta("J", Palo.P);
		carta7 = new Carta("J", Palo.P);
		carta8 = new Carta("J", Palo.P);
		carta9 = new Carta("J", Palo.P);
		carta10 = new Carta("3", Palo.P);
		mano = Arrays.asList(carta1, carta2, carta3, carta4, carta5);
		mano2 = Arrays.asList(carta6, carta7, carta8, carta9, carta10);
		pokerStatus = new PokerStatus();
	}
	
	@Test
	public void testPoquerVerdadero() {
		pokerStatus.verificarPoker(mano);
		assertTrue(pokerStatus.getJugadaActual().equals("Poker"));
	}
	
	@Test
	public void testTrioVerdadero() {
		 mano.get(0).setValor("7");
		 pokerStatus.verificarTrio(mano);
		assertTrue(pokerStatus.getJugadaActual().equals("Trio"));
	}
	
	@Test
	public void testColorVerdadero() {
		mano.get(1).setPalo(Palo.P);
		mano.get(2).setPalo(Palo.P);
		mano.get(3).setPalo(Palo.P);
		pokerStatus.verificarColor(mano);
		assertTrue(pokerStatus.getJugadaActual().equals("Color"));
	}
	
	@Test
	public void testSiEsTrioDevuelveStringTrio() {
		mano.get(0).setValor("7");
		assertTrue(pokerStatus.verificar(mano).equals("Trio"));
	}
	
	@Test
	public void testSiEsPokerDevuelveStringPoker() {
		assertTrue(pokerStatus.verificar(mano).equals("Poker"));
	}
	
	@Test
	public void testSiEsColorDevuelveStringColor() {
		mano.get(1).setPalo(Palo.P);
		mano.get(2).setPalo(Palo.P);
		mano.get(3).setPalo(Palo.P);
		mano.get(1).setValor("3");
		mano.get(2).setValor("6");
		assertTrue(pokerStatus.verificar(mano).equals("Color"));
	}
	
	@Test
	public void testLaPrimerCartaTieneMayorValorQueLaSegunda() {
		assertTrue(pokerStatus.laCarta_TieneMayorValorQue(carta4, carta5));
	}
	
	@Test
	public void testGanadorEntre2ManosUnaConPokerOtraConColor() {
		assertTrue(pokerStatus.ganadorEntre(mano, mano2).equals(mano));
	}
	
	@Test
	public void testPuntajeDeJugadasDeUnPoker() {
		assertEquals(3, pokerStatus.puntajeDeJugadasDe(mano));
	}
}
