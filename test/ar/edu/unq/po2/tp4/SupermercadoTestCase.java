package ar.edu.unq.po2.tp4;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SupermercadoTestCase {
	Producto productoCuidado;
	Producto productoNoCuidado;
	ArrayList<Producto> productos;
	Supermercado supermercado;
	Direccion direccion;
	
	@BeforeEach
	public void setUp() {
		productoCuidado = new Producto("leche", 100, true, 20);
		productoNoCuidado = new Producto("coca", 150, false, 5);
		direccion = new Direccion("almeyda", 100);
		productos = new ArrayList<Producto>();
		supermercado = new Supermercado("super", direccion, productos); //hacer que el supermerk2 calcule el precio final pasandole un porcentaje y copiando el metodo de preciofinal de producto
	}
	
	@Test
	public void testDescuento20APrecioCuidado() {
		double precio = supermercado.precioFinalDe(productoCuidado);
		assertEquals(precio, 80);
	}
	
	@Test
	public void testPrecioSinDescuento() {
		double precio = supermercado.precioFinalDe(productoNoCuidado);
		assertEquals(precio, 150);
	}
	
	@Test
	public void testDescuentoCambiadoAPrecioCuidado() {
		productoCuidado.cambiarPorcentajeDeDescuento(30);
		double precio = supermercado.precioFinalDe(productoCuidado);
		assertEquals(precio, 70);
	}
	
	@Test
	public void testCostoTotalDeProductos() {
		supermercado.agregarProducto(productoCuidado);
		supermercado.agregarProducto(productoNoCuidado);
		Double totalPrecio = supermercado.costoTotalDeProductos();
		assertEquals(230, totalPrecio);
		
	}
}
