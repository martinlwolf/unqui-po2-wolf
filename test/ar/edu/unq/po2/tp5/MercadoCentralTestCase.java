package ar.edu.unq.po2.tp5;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class MercadoCentralTestCase {
	MercadoCentral mercado;
	Cliente cliente;
	
	@BeforeEach
	public void setUp() {
		mercado = new MercadoCentral();
		mercado.añadirProductoTradicionalConNombre_YPrecio("coca", 10);
		mercado.añadirProductoTradicionalConNombre_YPrecio("agua", 20);
		mercado.añadirProductoTradicionalConNombre_YPrecio("jugo", 30);
		mercado.añadirProductoCooperativaConNombre_YPrecio("harina", 40);
		mercado.aumentarStockEn_AProductoConNombre(1, "coca");
		mercado.aumentarStockEn_AProductoConNombre(1, "agua");
		mercado.aumentarStockEn_AProductoConNombre(1, "jugo");
		mercado.aumentarStockEn_AProductoConNombre(1, "harina");
		cliente = new Cliente();
		cliente.agregarProductoDelMercado_ConNombre_ALaLista(mercado, "coca");
		cliente.agregarProductoDelMercado_ConNombre_ALaLista(mercado, "agua");
		cliente.agregarProductoDelMercado_ConNombre_ALaLista(mercado, "jugo");
		cliente.agregarProductoDelMercado_ConNombre_ALaLista(mercado, "harina");
	}
	
	@Test
	public void testAñadirUnProducto() {
		mercado.añadirProductoTradicionalConNombre_YPrecio("chocolate", 40);
		assertEquals(5, mercado.cantidadDeProductos());
	}
	
	@Test
	public void testAgregarStockAUnProducto() {
		mercado.aumentarStockEn_AProductoConNombre(10, "coca");
		assertEquals(11, mercado.stockDeProductoConNombre("coca"));
	}
	
	@Test
	public void testMontoAPagarDeCliente() {
		double monto = cliente.montoAPagarPorSusProductosEnMercado_(mercado);
		assertEquals(96, monto);
		assertEquals(0, mercado.stockDeProductoConNombre("coca"));
	}
}
