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
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class EncriptadorNaiveTestCase {
	private EncriptadorNaive encriptador;
	@Mock private MetodoVocales vocales;
	@Mock private MetodoNumerico numerico;
	
	@BeforeEach
	public void setUp() {
		this.encriptador = new EncriptadorNaive();
		this.vocales = mock(MetodoVocales.class);
		this.numerico = mock(MetodoNumerico.class);
		
	}
	
	@Test
	public void testCuandoQuieroEncriptarLaPalabraCaosConMetodoVocalLaEncripta() {
		this.encriptador.setMetodo(vocales);
		when(this.vocales.encriptar("caos")).thenReturn("ceus");
		assertEquals("ceus", this.encriptador.encriptar("caos"));
	}
	
	@Test
	public void testCuandoQuieroEncriptarLaPalabraCaosConMetodoNumericoLaEncripta() {
		this.encriptador.setMetodo(numerico);
		when(this.numerico.encriptar("caos")).thenReturn("311519");
		assertEquals("311519", this.encriptador.encriptar("caos"));
	}
}
