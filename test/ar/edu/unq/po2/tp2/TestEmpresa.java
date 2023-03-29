package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
public class TestEmpresa {
	
	
	/**
	 * Define 3 empleados de diferente tipo
	 */
	Empresa empresa;
	EmpleadoPermanente empPermanenteCasado;
	EmpleadoPermanente empPermanenteSoltero;
	EmpleadoTemporario empTemporarioMasDe50;
	EmpleadoTemporario empTemporarioMenosDe50;
	EmpleadoContratado empContratado;
	ArrayList<Empleado> listaEmpleados;
	
	/**
	 *  Creacion de instancias de los 3 empleados
	 */
	@BeforeEach
	public void setUp() {
		this.empPermanenteCasado = new EmpleadoPermanente("Marcos Garmendia", "Lavalle 300", "casado" , LocalDate.of(2000, 5, 10), 1000, 1, 10);
		this.empPermanenteSoltero = new EmpleadoPermanente("Pablo Kovak", "Corrientes 50", "soltero" , LocalDate.now(), 1000, 1, 10);
		this.empTemporarioMasDe50 = new EmpleadoTemporario("Sebastian Gomez", "Peru 1800", "soltero", LocalDate.of(1972, 2, 10),
				1000, LocalDate.now(), 10);
		this.empTemporarioMenosDe50 = new EmpleadoTemporario("Sebastian Gomez", "Peru 1800", "soltero", LocalDate.now(),
				1000, LocalDate.now(), 10);
		this.empContratado = new EmpleadoContratado("Carlos Rojas", "Lartigau 2000", "casado", LocalDate.now(),
				1000, "cheque", 500);
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaEmpleados.add(empPermanenteCasado);
		this.listaEmpleados.add(empPermanenteSoltero);
		this.listaEmpleados.add(empTemporarioMasDe50);
		this.listaEmpleados.add(empTemporarioMenosDe50);
		this.listaEmpleados.add(empContratado);
		this.empresa = new Empresa("Ford", 123, listaEmpleados);
	}
	
	/**
	 * Calculo de edad
	 */
	@Test
	public void testDeCalculoDeEdadDeEmpleado() {
		int edad = empPermanenteCasado.edad();
		assertEquals(22, edad);
	}
	
	/**
	 * 2 tests para el empleado permanente con conyuge y sin conyuge. El primero deberia tener un sueldo bruto 100 pesos mayor al segundo.
	 */
	@Test
	public void testDeSueldoBrutoDeEmpPermanenteCasado() {
		int sueldoBruto = empPermanenteCasado.sueldoBruto();
		assertEquals(1750, sueldoBruto);
	}
	
	@Test
	public void testDeSueldoBrutoDeEmpPermanenteSoltero() {
		int sueldoBruto = empPermanenteSoltero.sueldoBruto();
		assertEquals(1650, sueldoBruto);
	}
	/**
	 * Sueldos netos en empleados permanentes
	 */
	@Test
	public void testDeSueldoNetoDeEmpPermanenteCasado() {
		int sueldoNeto = empPermanenteCasado.sueldoNeto();
		assertEquals(1293, sueldoNeto);
	}
	
	@Test
	public void testDeSueldoNetoDeEmpPermanenteSoltero() {
		int sueldoNeto = empPermanenteSoltero.sueldoNeto();
		assertEquals(1218, sueldoNeto);
	}
	
	/**
	 * 2 test en empleados temporarios. El primero tiene mas de 50 años de antiguedad y el segundo no. El primero deberia tener $25 menos de sueldo neto por las retenciones
	 */
	@Test
	public void testSueldoNetoEmpTemporarioConAntiguedadMayorA50() {
		int sueldoNeto = empTemporarioMasDe50.sueldoNeto();
		assertEquals(1045, sueldoNeto);
	}
	@Test
	public void testSueldoNetoEmpTemporarioConAntiguedadMenorA50() {
		int sueldoNeto = empTemporarioMenosDe50.sueldoNeto();
		assertEquals(1070, sueldoNeto);
	}
	
	/**
	 * Test de empleado contratado con $50 de retenciones
	 */
	@Test
	public void testSueldoNetoEmpContratado() {
		int sueldoNeto = empContratado.sueldoNeto();
		assertEquals(950, sueldoNeto);
	}
	
	/**
	 * Tests de sueldos y retenciones totales de los empleados en la empresa 
	 */
	@Test
	public void testTotalSueldoBruto() {
		int totalSueldoBruto = empresa.totalSueldosBrutos();
		assertEquals(7200, totalSueldoBruto);
	}
	@Test
	public void testTotalSueldoNeto() {
		int totalSueldoNeto = empresa.totalSueldosNetos();
		assertEquals(5576, totalSueldoNeto);
	}
	@Test
	public void testTotalRetenciones() {
		int totalRetenciones = empresa.totalRetenciones();
		assertEquals(1624, totalRetenciones);
	}
	
	/**
	 * Test de creacion de recibos sobre el primer recibo en liquidacion de sueldos 
	 */
	@Test
	public void testLiquidacionDeSueldos() {
		empresa.liquidarDeSueldos();
		ArrayList<Recibo> recibos = empresa.getRecibos();
		Recibo primerRecibo = recibos.get(0);
		int sueldoNeto = primerRecibo.sueldoNeto;
		int sueldoBruto = primerRecibo.sueldoBruto;
		assertEquals(1293, sueldoNeto);
		assertEquals(1750, sueldoBruto);
	}
}
