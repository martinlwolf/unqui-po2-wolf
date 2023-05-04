package ar.edu.unq.po2.tp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTestCase extends PointTestCase {
	Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() {
		punto = new Punto(1, 1);
		rectangulo = new Rectangulo(punto, 2, 4);
	}
	
	@Test
	public void testCreacionDelRectangulo() {
		Punto esquinaSupIzq = rectangulo.esquinaSuperiorIzquierda();
		assertEquals(esquinaSupIzq.getX(), 1);
		assertEquals(esquinaSupIzq.getY(), 3);
	}
	
	@Test
	public void testMoverRectangulo() {
		Punto nuevoPunto = new Punto(3, 3);
		rectangulo.moverRectanguloAPunto(nuevoPunto);
		Punto esquinaSupIzq = rectangulo.esquinaSuperiorIzquierda();
		assertEquals(esquinaSupIzq.getX(), 3);
		assertEquals(esquinaSupIzq.getY(), 5);
	}
	
	@Test
	public void testAreaDelRectangulo() {
		assertEquals(rectangulo.area(), 8);
	}
}
