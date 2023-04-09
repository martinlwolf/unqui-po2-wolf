package ar.edu.unq.po2.tp4;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TrabajadorTestCase {
	Trabajador trabajador;
	ArrayList<Ingreso> listaDeIngresos;
	IngresoCorriente ingresoCorriente;
	IngresoExtra ingresoExtra;
	
	@BeforeEach
	public void setUp() {
		ingresoCorriente = new IngresoCorriente(LocalDate.now().getMonth(), "concepto", 200);
		ingresoExtra = new IngresoExtra(LocalDate.now().getMonth(), "concepto", 100, 10);
		listaDeIngresos = new ArrayList<Ingreso>();
		listaDeIngresos.add(ingresoCorriente);
		listaDeIngresos.add(ingresoExtra);
		trabajador = new Trabajador(this.listaDeIngresos);
	}
	
	@Test
	public void testMontoTotalDeImpuestos() {
		double impuestoTotal = trabajador.getImpuestoAPagar();
		assertEquals(4, impuestoTotal);
	}
	
	@Test
	public void testMontoTotalSinImpuestos() {
		double totalPercibido = trabajador.getTotalPercibido();
		assertEquals(300, totalPercibido);
	}
	
	@Test
	public void testMontoImponible() {
		double totalMontoImponible = trabajador.getMontoImponible();
		assertEquals(296, totalMontoImponible);
	}
}
