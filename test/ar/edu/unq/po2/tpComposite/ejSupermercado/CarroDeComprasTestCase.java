package ar.edu.unq.po2.tpComposite.ejSupermercado;
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


public class CarroDeComprasTestCase {
	private CarroDeCompras carro1;
	@Mock private Producto producto;
	@Mock private ProductoEspecial especial;
	
	@BeforeEach 
	public void setUp() {
		this.producto = mock(Producto.class);
		this.especial = mock(ProductoEspecial.class);
		this.carro1 = new CarroDeCompras(Arrays.asList(producto, especial));
	}
	
	@Test
	public void cuandoPidoElTotalSinRedondearMeLoDevuelve() {
		when(producto.getPrecio()).thenReturn(20.3);
		when(especial.getPrecio()).thenReturn(10.3);
		assertEquals(30.6, this.carro1.total());
	}
}
