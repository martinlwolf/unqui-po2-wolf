package ar.edu.unq.po2.tp6;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class BancoTestCase {
	Cliente cliente1;
	Cliente cliente2;
	Banco banco;
	
	@BeforeEach
	public void setUp() {
		cliente1 = new Cliente("carlos", "Andujar", "alvear", 20, 100);
		cliente2 = new Cliente("miguel", "Perez", "rivadavia", 60, 150);
		banco = new Banco();
	}
	
	@Test
	public void testAumentoDeSolicitudesAlPedirUna() {
		cliente1.solicitarPrestamoPersonalDe_EnBanco_En_Cuotas(1000, this.banco, 12);
		assertEquals(1, this.banco.cantidadDeSolicitudes());
	}
	
	
	
	
}
