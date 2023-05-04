package ar.edu.unq.po2.tpTestDoubles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when; 
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PokerStatus {
	
	private String jugadaActual;
	private List<String> valorDeJugadas;

	public PokerStatus() {
		super();
		this.jugadaActual = "Nada";
		this.valorDeJugadas = Arrays.asList("Nada", "Trio", "Color", "Poker");
	}

	public void verificarPoker(List<Carta> mano) {
		if(mano.stream().anyMatch(carta -> carta.hacePokerEn(mano))) {
			this.jugadaActual = "Poker";
		}
	}

	public void verificarTrio(List<Carta> mano) {
		if(mano.stream().anyMatch(carta -> carta.haceTrioEn(mano))) {
			this.jugadaActual = "Trio";
		}
	}

	public void verificarColor(List<Carta> mano) {
		if(mano.stream().anyMatch(carta -> carta.haceColorEn(mano))) {
			this.jugadaActual = "Color";
		}
	}

	public String verificar(List<Carta> mano) {
		 this.verificarTrio(mano);
		 this.verificarColor(mano);
		 this.verificarPoker(mano);
		return jugadaActual;
	}

	public String getJugadaActual() {
		return jugadaActual;
	}

	public void setJugadaActual(String jugadaActual) {
		this.jugadaActual = jugadaActual;
	}

	public boolean laCarta_TieneMayorValorQue(Carta carta, Carta carta2) {
		return carta.valorNumerico() > carta2.valorNumerico();
	}

	public List<Carta> ganadorEntre(List<Carta> mano, List<Carta> mano2) {
		if(this.laMano_TieneMasPuntosQue_(mano,mano2)) {
			return mano;
		}
		else return mano2;
	}

	private boolean laMano_TieneMasPuntosQue_(List<Carta> mano, List<Carta> mano2) {
		int puntajeSegunJugadasMano1 = this.puntajeDeJugadasDe(mano);
		this.jugadaActual = "Nada";
		int puntajeSegunJugadasMano2 = this.puntajeDeJugadasDe(mano2);
		if(puntajeSegunJugadasMano1 == puntajeSegunJugadasMano2) {
			return this.laMano_TieneMasPuntosSegunValorQue_(mano, mano2);
		}
		else {
			return puntajeSegunJugadasMano1 > puntajeSegunJugadasMano2;
		}
	}

	private boolean laMano_TieneMasPuntosSegunValorQue_(List<Carta> mano, List<Carta> mano2) {
		int valorMano1 = mano.stream().mapToInt(carta -> carta.valorNumerico()).sum();
		int valorMano2 = mano2.stream().mapToInt(carta2 -> carta2.valorNumerico()).sum();
		return valorMano1 > valorMano2;
	}

	public int puntajeDeJugadasDe(List<Carta> mano) {
		int contador = 0;
		while(contador != 3 & this.verificar(mano) != this.valorDeJugadas.get(contador)) {
			contador = contador + 1;
		}
		return contador;
	}
	
	
	
	
	
}
