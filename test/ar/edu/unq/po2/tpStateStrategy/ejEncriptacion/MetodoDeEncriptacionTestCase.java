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

public class MetodoDeEncriptacionTestCase {
	
	private MetodoVocales vocales;
	private MetodoNumerico numerico;
	
	@BeforeEach
	public void setUp() {
		this.vocales = new MetodoVocales();
		this.numerico = new MetodoNumerico();
	}
	
	@Test
	public void testCuandoEncriptoLaPalabraPuesConVocalesDevuelvePais() {
		assertEquals("pais", this.vocales.encriptar("pues"));
	}
	
	@Test
	public void testCuandoDesencriptoLaPalabraPaisConVocalesDevuelvePues() {
		assertEquals("pues", this.vocales.desencriptar("pais"));
	}
	
	@Test
	public void testCuandoEncriptoLaPalabraPuesConNumericoDevuelveUnNumero() {
		assertEquals("16,1,9,19", this.numerico.encriptar("pais"));
	}
	
	@Test
	public void testCuandoDesencriptoUnNumeroConNumericoDevuelvePais() {
		assertEquals("pais", this.numerico.desencriptar("16,1,9,19"));
	}
}
