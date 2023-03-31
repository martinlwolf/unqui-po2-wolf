package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Multiplos extends Counter {
	int numero1;
	int numero2;
	int contador;
	
	
	public int numeroMasGrandeMultiploDe_Y_(int num1, int num2) {
		contador = 1000;
		while(this.noEs_MultiploDe_Y_(contador, num1, num2) & contador != -1) {
			contador = contador - 1;
		}
		return contador;
	}
	
	public boolean es_MultiploDe_Y_(int numero, int mul1, int mul2) {
		return ((numero % mul1 == 0) & (numero % mul2 == 0));
	}
	
	public boolean noEs_MultiploDe_Y_(int numero, int mul1, int mul2) {
		return (this.es_MultiploDe_Y_(numero, mul1, mul2) == false);
	}
}
