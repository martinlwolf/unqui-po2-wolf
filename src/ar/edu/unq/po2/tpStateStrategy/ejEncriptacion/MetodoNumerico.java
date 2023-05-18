package ar.edu.unq.po2.tpStateStrategy.ejEncriptacion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class MetodoNumerico implements MetodoDeEncriptacion {
	
	private HashMap<String, String> mapaLetras;
	private HashMap<String, String> mapaNumeros;
	
	

	public MetodoNumerico() {
		super();
		this.mapaLetras = new HashMap<>();
		mapaLetras.put("a", "1");
        mapaLetras.put("b", "2");
        mapaLetras.put("c", "3");
        mapaLetras.put("d", "4");
        mapaLetras.put("e", "5");
        mapaLetras.put("f", "6");
        mapaLetras.put("g", "7");
        mapaLetras.put("h", "8");
        mapaLetras.put("i", "9");
        mapaLetras.put("j", "10");
        mapaLetras.put("k", "11");
        mapaLetras.put("l", "12");
        mapaLetras.put("m", "13");
        mapaLetras.put("n", "14");
        mapaLetras.put("o", "15");
        mapaLetras.put("p", "16");
        mapaLetras.put("q", "17");
        mapaLetras.put("r", "18");
        mapaLetras.put("s", "19");
        mapaLetras.put("t", "20");
        mapaLetras.put("u", "21");
        mapaLetras.put("v", "22");
        mapaLetras.put("w", "23");
        mapaLetras.put("x", "24");
        mapaLetras.put("y", "25");
        mapaLetras.put("z", "26");
        this.mapaNumeros = new HashMap<>();
        mapaNumeros.put("1", "a");
        mapaNumeros.put("2", "b");
        mapaNumeros.put("3", "c");
        mapaNumeros.put("4", "d");
        mapaNumeros.put("5", "e");
        mapaNumeros.put("6", "f");
        mapaNumeros.put("7", "g");
        mapaNumeros.put("8", "h");
        mapaNumeros.put("9", "i");
        mapaNumeros.put("10", "j");
        mapaNumeros.put("11", "k");
        mapaNumeros.put("12", "l");
        mapaNumeros.put("13", "m");
        mapaNumeros.put("14", "n");
        mapaNumeros.put("15", "o");
        mapaNumeros.put("16", "p");
        mapaNumeros.put("17", "q");
        mapaNumeros.put("18", "r");
        mapaNumeros.put("19", "s");
        mapaNumeros.put("20", "t");
        mapaNumeros.put("21", "u");
        mapaNumeros.put("22", "v");
        mapaNumeros.put("23", "w");
        mapaNumeros.put("24", "x");
        mapaNumeros.put("25", "y");
        mapaNumeros.put("26", "z");
	}

	@Override
	public String encriptar(String string) {
		List<String> listaSeparada = Arrays.asList(string.split(""));
		ArrayList<String> listaEncriptada = new ArrayList<String>();
		for(String letra : listaSeparada) {
			listaEncriptada.add(this.encriptarLetra(letra));
		}
		return String.join(",", listaEncriptada);
	}

	private String encriptarLetra(String letra) {
		return this.mapaLetras.get(letra);
	}

	@Override
	public String desencriptar(String string) {
		List<String> listaSeparada = Arrays.asList(string.split(","));
		ArrayList<String> listaEncriptada = new ArrayList<String>();
		for(String letra : listaSeparada) {
			listaEncriptada.add(this.desencriptarNumero(letra));
		}
		return String.join("", listaEncriptada);
	}

	private String desencriptarNumero(String numero) {
		return this.mapaNumeros.get(numero);
	}

}
