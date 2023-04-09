package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Multioperador extends Multiplos {

	public Integer sumarLaLista(ArrayList<Integer> listaDeNumeros) {
		int numeroResultante = 0;
		while (listaDeNumeros.size() > 0) {
			numeroResultante = numeroResultante + listaDeNumeros.get(0);
			listaDeNumeros.remove(0);
		}
		return numeroResultante;
	}

	public Integer restarLaLista(ArrayList<Integer> listaDeNumeros) {
		int numeroResultante = 0;
		while (listaDeNumeros.size() > 0) {
			numeroResultante = numeroResultante - listaDeNumeros.get(0);
			listaDeNumeros.remove(0);
		}
		return numeroResultante;
	}

	public Integer multiplicarLaLista(ArrayList<Integer> listaDeNumeros) {
		int numeroResultante = 0;
		numeroResultante = 1;
		while (listaDeNumeros.size() > 0) {
			numeroResultante = numeroResultante * listaDeNumeros.get(0);
			listaDeNumeros.remove(0);
		}
		return numeroResultante;
	}
	
}
