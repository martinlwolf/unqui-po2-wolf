package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase extends MultiplosTestCase {
	ArrayList<Integer> listaDeNumeros;
	Multioperador multioperador;
	
	@BeforeEach
	public void setUp() {
		listaDeNumeros = new ArrayList<Integer>();
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(4);
		multioperador = new Multioperador();
	}
	
	@Test
	public void testSumaMultioperador() {
		assertEquals(multioperador.sumarLaLista(listaDeNumeros), 10);
	}

	@Test
	public void testRestaMultioperador() {
		assertEquals(multioperador.restarLaLista(listaDeNumeros), -10);
	}

	@Test
	public void testMultiplicacionMultioperador() {
		assertEquals(multioperador.multiplicarLaLista(listaDeNumeros), 24);
	}
	
}
