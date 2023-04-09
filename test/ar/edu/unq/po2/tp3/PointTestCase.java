package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PointTestCase {
	Point punto;
	Point punto2;
	@BeforeEach
	public void setUp() {
		punto = new Point(1, 1);
		punto2 = new Point (2,-2);
	}
	
	@Test
	public void testMoverPunto() {
		punto.moverPuntoEstasUnidades_EnDireccion_(3, new Norte());
		assertEquals(4, punto.getY());
	}
	
	@Test
	public void testSumarPuntoConOtro() {
		punto.sumarseCon_(punto2);
		assertEquals(-1, punto.getY());
	}
}
