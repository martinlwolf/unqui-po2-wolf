package ar.edu.unq.po2.tpStreamsYEnums;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ColoresLesionesDermatologicasTestCase {
	
	@Test
	public void testCadaColorTieneSuDescripcion() {
		assertEquals("DescRojo", ColoresLesionesDermatologicas.Rojo.descripcion());
		assertEquals("DescGris", ColoresLesionesDermatologicas.Gris.descripcion());
		assertEquals("DescAmarillo", ColoresLesionesDermatologicas.Amarillo.descripcion());
		assertEquals("DescMiel", ColoresLesionesDermatologicas.Miel.descripcion());
	}
	@Test
	public void testCadaColorTieneSuRiesgo() {
		assertEquals(4, ColoresLesionesDermatologicas.Rojo.riesgo());
		assertEquals(3, ColoresLesionesDermatologicas.Gris.riesgo());
		assertEquals(2, ColoresLesionesDermatologicas.Amarillo.riesgo());
		assertEquals(1, ColoresLesionesDermatologicas.Miel.riesgo());
	}
	@Test
	public void testElSiguienteDeCadaColorEsElQueCorresponde() {
		assertEquals(ColoresLesionesDermatologicas.Gris, ColoresLesionesDermatologicas.Rojo.siguienteColor());
		assertEquals(ColoresLesionesDermatologicas.Amarillo, ColoresLesionesDermatologicas.Gris.siguienteColor());
		assertEquals(ColoresLesionesDermatologicas.Miel, ColoresLesionesDermatologicas.Amarillo.siguienteColor());
		assertEquals(ColoresLesionesDermatologicas.Rojo, ColoresLesionesDermatologicas.Miel.siguienteColor());
	}
}
