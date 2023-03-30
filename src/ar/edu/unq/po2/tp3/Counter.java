package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Counter {
	
	List<Integer> listaDeNumeros;
	
	

	public Counter() {
		super();
		listaDeNumeros = new ArrayList<Integer>();
	}

	public void addNumber(int numero) {
		listaDeNumeros.add(numero);
	}

	public List<Integer> obtenerLosNumerosImpares() {
		
		return listaDeNumeros.stream().filter(numero -> this.esImpar(numero)).collect(Collectors.toList());
	}

	public List<Integer> obtenerLosNumerosPares() {
		
		return listaDeNumeros.stream().filter(numero -> this.esPar(numero)).collect(Collectors.toList());
	}

	public List<Integer> obtenerMultiplosDe(Integer numero2) {
		return listaDeNumeros.stream().filter(numero -> this.es_MultiploDe_(numero, numero2)).collect(Collectors.toList());
	}

	public boolean esPar(Integer numero) {
		return (numero % 2 == 0);
	}
	
	private boolean esImpar(Integer numero) {
		// TODO Auto-generated method stub
		return (esPar(numero) == false);
	}
	
	private boolean es_MultiploDe_(Integer numero, Integer numero2) {
		// TODO Auto-generated method stub
		return (numero % numero2 == 0);
	}

}
