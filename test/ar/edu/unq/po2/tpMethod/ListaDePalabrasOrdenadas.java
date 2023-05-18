package ar.edu.unq.po2.tpMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ListaDePalabrasOrdenadas {
		private List<String>palabras;
		private final Comparator comparador;
		public ListaDePalabrasOrdenadas(){
		this.palabras=new ArrayList<String>();
		this.comparador=new Comparator(){
		@Override
		public int compare(Object palabraA, Object palabraB) {
		String a=((String)palabraA);
		String b=(((String)palabraB));
		return a.compareToIgnoreCase(b);
		}
		};
		}
		public void agregarPalabra(String palabra){
		this.palabras.add(palabra);
		Collections.sort(this.palabras, this.comparador);
		}
		public Integer cantidadDePalabras(){
		return this.palabras.size();
		}
		public String getPalabraDePosicion(int posicion){
		return this.palabras.get(posicion);
		}
		
}
