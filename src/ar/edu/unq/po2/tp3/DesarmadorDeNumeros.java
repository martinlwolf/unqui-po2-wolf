package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DesarmadorDeNumeros {
	
	public ArrayList<Integer> desarmarNumero(int numero) {
		ArrayList<Integer> numeroDesarmadoEnLista = new ArrayList<Integer>();
		int numeroAProcesar = numero;
		while(numeroAProcesar >= 1) {
			numeroDesarmadoEnLista.add(0, (numeroAProcesar % 10));
			numeroAProcesar = numeroAProcesar / 10;
		}
		return numeroDesarmadoEnLista;
	}

	public double numeroConMasDigitosParesEntre_Y_(int numero1, int numero2) {
		List <Integer> numero1Desarmado = this.desarmarNumero(numero1);
		List <Integer> numero2Desarmado = this.desarmarNumero(numero2);
		List <Integer> testDesarmadoQuePaso = null;
		Counter contadorDePares = new Counter();
		double numeroConMasParesRearmado = 0;
		if (contadorDePares.cantidadDeNumerosPares(numero1Desarmado) > contadorDePares.cantidadDeNumerosPares(numero2Desarmado)) {
			testDesarmadoQuePaso = numero1Desarmado;
		}
		else {
			testDesarmadoQuePaso = numero2Desarmado;
		}
		numeroConMasParesRearmado = this.rearmarNumeroDeLista(testDesarmadoQuePaso);
		return numeroConMasParesRearmado;
	}
	
	public double rearmarNumeroDeLista(List<Integer> listaEnteros) {
		List<Integer> listaDeEnteros = listaEnteros;
		double numeroRearmado = 0;
		while (listaDeEnteros.isEmpty() == false) {
			numeroRearmado = numeroRearmado + (listaDeEnteros.get(0) * (Math.pow(10, (listaDeEnteros.size() - 1)))) ;
			listaDeEnteros.remove(0);
		}
		return numeroRearmado;
	}
}
