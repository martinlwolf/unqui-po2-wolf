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

public class MetodoVocales implements MetodoDeEncriptacion {
	
	private List<String> listaVocales;

	public MetodoVocales() {
		super();
		this.listaVocales = Arrays.asList("a", "e", "i", "o", "u");
	}

	@Override
	public String encriptar(String string) {
		List<String> listaSeparada = Arrays.asList(string.split(""));
		ArrayList<String> listaEncriptada = new ArrayList<String>();
		for(String letra : listaSeparada) {
			listaEncriptada.add(this.encriptarLetra(letra));
		}
		return String.join("", listaEncriptada);
	}

	private String encriptarLetra(String letra) {
		if(this.listaVocales.contains(letra)) {
			return this.vocalSiguienteA(letra);
		}
		else {
			return letra;
		}	
	}

	private String vocalSiguienteA(String letra) {
		if(letra.equals("a")) {
			return "e";
		}
		else {
			if(letra.equals("e")) {
				return "i";
			}
			else {
				if(letra.equals("i")) {
					return "o";
				}
				else {
					if(letra.equals("o")) {
						return "u";
					}
					else {
						return "a";
					}
				}
			}
		}
		
	}

	@Override
	public String desencriptar(String string) {
		List<String> listaSeparada = Arrays.asList(string.split(""));
		ArrayList<String> listaEncriptada = new ArrayList<String>();
		for(String letra : listaSeparada) {
			listaEncriptada.add(this.desencriptarLetra(letra));
		}
		return String.join("", listaEncriptada);
	}

	private String desencriptarLetra(String letra) {
		if(this.listaVocales.contains(letra)) {
			return this.vocalAnteriorA(letra);
		}
		else {
			return letra;
		}	
	}
	
	private String vocalAnteriorA(String letra) {
		if(letra.equals("a")) {
			return "u";
		}
		else {
			if(letra.equals("e")) {
				return "a";
			}
			else {
				if(letra.equals("i")) {
					return "e";
				}
				else {
					if(letra.equals("o")) {
						return "i";
					}
					else {
						return "o";
					}
				}
			}
		}
		
	}

}
