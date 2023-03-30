package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
	
	Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(15);
		counter.addNumber(1);
		counter.addNumber(10);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testNumerosPares() {
	// Getting the even occurrences
	int cantidadDePares = counter.obtenerLosNumerosPares().size();
	// I check the amount is the expected one
	assertEquals(cantidadDePares, 2);
	}
	
	@Test
	public void testNumerosImpares() {
		int cantidadDeImpares = counter.obtenerLosNumerosImpares().size();
		assertEquals(cantidadDeImpares, 8);
	}
	
	@Test
	public void testNumerosMultiplosDe5() {
		int cantidadDeMultiplos = counter.obtenerMultiplosDe(5).size();
		assertEquals(cantidadDeMultiplos, 3);
	}
}
