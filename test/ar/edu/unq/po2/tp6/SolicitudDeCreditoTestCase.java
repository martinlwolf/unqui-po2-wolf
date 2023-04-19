package ar.edu.unq.po2.tp6;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SolicitudDeCreditoTestCase {
	
	private SolicitudPersonal solicitudPersonal;
	private SolicitudHipotecaria solicitudHipotecaria;
	private Cliente cliente1;
	private Cliente cliente2;
	private Propiedad propiedad;
	
	@BeforeEach
	public void setUp() {
		cliente1 = new Cliente("carlos", "Andujar", "alvear", 64, 1000);
		cliente2 = new Cliente("miguel", "Perez", "rivadavia", 60, 1500);
		propiedad = new Propiedad(10000);
	}
	
	@Test
	public void testPersonalCuandoNoSeCumplenNingunoDeLos2Requisitos() {
		solicitudPersonal = new SolicitudPersonal(cliente1, 8500, 12);
		solicitudPersonal.actualizarAprobacion();
		assertTrue(solicitudPersonal.getEstadoDeAprobacion().esRechazado());
		
	}
	
	@Test
	public void testPersonalCuandoSeCumplenLos2Requisitos() {
		solicitudPersonal = new SolicitudPersonal(cliente2, 12000, 12);
		solicitudPersonal.actualizarAprobacion();
		assertTrue(solicitudPersonal.getEstadoDeAprobacion().esAprobado());
		
	}
	
	@Test
	public void testPersonalCuandoSeCumple1Requisito() {
		solicitudPersonal = new SolicitudPersonal(cliente2, 12000, 3);
		solicitudPersonal.actualizarAprobacion();
		assertTrue(solicitudPersonal.getEstadoDeAprobacion().esRechazado());
		
	}
	
	@Test
	public void testHipotecarioCuandoNoSeCumplenLos3Requisitos() {
		solicitudHipotecaria = new SolicitudHipotecaria(cliente1, 8500, 12, this.propiedad);
		solicitudHipotecaria.actualizarAprobacion();
		assertTrue(solicitudHipotecaria.getEstadoDeAprobacion().esRechazado());
		
	}
	
	@Test
	public void testHipotecarioCuandoSeCumplenLos3Requisitos() {
		solicitudHipotecaria = new SolicitudHipotecaria(cliente2, 5000, 12, this.propiedad);
		solicitudHipotecaria.actualizarAprobacion();
		assertTrue(solicitudHipotecaria.getEstadoDeAprobacion().esAprobado());
		
	}
}
