package ar.edu.unq.po2.tpTestDoubles;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Carta {

	private String valor;
	private Palo palo;
	private ArrayList<String> valoresPosibles;
	
	public Carta(String valor, Palo palo) {
		super();
		this.palo = palo;
		this.valor = valor;
		this.valoresPosibles = new ArrayList<String>(Arrays.asList("2","3","4","5","6","7","8","9","10","A","K","Q","J"));
	}

	public Palo getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
			this.valor = valor;
	}

	public boolean hacePokerEn(List<Carta> mano) {
		int contador = 0;
		for(Carta carta : mano) {
			contador = contador + this.devuelve1SiTieneElMismoValorQue_0SiNo(carta);
		}
		return contador >= 4;
	}

	public boolean haceTrioEn(List<Carta> mano) {
		int contador = 0;
		for(Carta carta : mano) {
			contador = contador + this.devuelve1SiTieneElMismoValorQue_0SiNo(carta);
		}
		return contador == 3;
	}

	public boolean haceColorEn(List<Carta> mano) {
		int contador = 0;
		for(Carta carta : mano) {
			contador = contador + this.devuelve1SiTieneElMismoPaloQue_0SiNo(carta);
		}
		return contador == 5;
	}
	
	private int devuelve1SiTieneElMismoPaloQue_0SiNo(Carta carta) {
		if(this.getPalo() == carta.getPalo()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	private int devuelve1SiTieneElMismoValorQue_0SiNo(Carta carta) {
		if(this.getValor() == carta.getValor()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public int valorNumerico() {
		List<String> valores = this.valoresPosibles;
		int contador = 1;
		while(valores.size() > 0 & this.valor != valores.get(0)) {
			valores.remove(0);
			contador = contador + 1;
		}
		return contador;
	}
	}
