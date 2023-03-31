package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiplosTestCase {
	
	Multiplos multiplo;
	
	@BeforeEach
	public void setUp() {
		multiplo = new Multiplos();
	}
	
	@Test
	public void testNumeroMasAltoEntre0YMilExistenteMultiploDe2Numeros() {
		int num1 = 2;
		int num2 = 3;
		int numeroResultante = multiplo.numeroMasGrandeMultiploDe_Y_(num1, num2);
		assertEquals(numeroResultante, 996);
	}
	
	@Test
	public void testNumeroMasAltoEntre0YMilInexistenteMultiploDe2Numeros() {
		int num1 = 139;
		int num2 = 391;
		int numeroResultante = multiplo.numeroMasGrandeMultiploDe_Y_(num1, num2);
		assertEquals(numeroResultante, 0);
	}
}
