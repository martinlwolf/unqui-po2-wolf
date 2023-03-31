package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DesarmadorTestCase {
	
	DesarmadorDeNumeros desarmador;
	ArrayList<Integer> listaConEnteros;
	ArrayList<Integer> listaConEnteros2;
	
	
	@BeforeEach
	public void setUp() {
		desarmador = new DesarmadorDeNumeros();
		listaConEnteros = new ArrayList<Integer>();
		listaConEnteros2 = new ArrayList<Integer>();
	}
	

	@Test
	/**
	 * Testea que la posicion de los numeros en la lista de desarmados sea la correcta
	 */
	public void testDesarmarEnteroEnUnaLista() {
		int numeroADesarmar = 1223;
		listaConEnteros = desarmador.desarmarNumero(numeroADesarmar);
		assertEquals(listaConEnteros.get(3),3);
	}
	
	@Test
	/**
	 * Testea que se devuelva el numero con la mayor cantidad de digitos pares entre 2 enteros
	 */
	public void testDevolverElNumeroConMasParesEntre2() {
		int numero1 = 1235;
		int numero2 = 2467;
		double numeroConMasPares = desarmador.numeroConMasDigitosParesEntre_Y_(numero1, numero2);
		assertEquals(numeroConMasPares, numero2);
		
	}
	
	@Test
	public void testDevolverElNumeroConMasPares() {
		Integer numero1 = 1235;
		Integer numero2 = 2467;
		Integer numero3 = 2222;
		Integer numero4 = 7777;
		DesarmadorDeNumeros desarmador = new DesarmadorDeNumeros();
		Counter contador = new Counter();
		listaConEnteros.add(numero1);
		listaConEnteros.add(numero2);
		listaConEnteros.add(numero3);
		listaConEnteros.add(numero4);
		int numeroConMasPares = listaConEnteros.stream().max((Integer n1, Integer n2)->contador.cantidadDeNumerosPares(desarmador.desarmarNumero(n1)).compareTo(contador.cantidadDeNumerosPares(desarmador.desarmarNumero(n2)))).get();
		assertEquals(numeroConMasPares, numero3);
	}
	
	
}
