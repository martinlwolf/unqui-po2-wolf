package ar.edu.unq.po2.tp6;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Banco {
	private ArrayList<Cliente> listaDeClientes;
	private ArrayList<SolicitudDeCredito> listaDeSolicitudes;

	public Banco() {
		super();
		this.listaDeClientes = new ArrayList<Cliente>();
		this.listaDeSolicitudes = new ArrayList<SolicitudDeCredito>();
	}

	public Integer cantidadDeSolicitudes() {
		return this.listaDeSolicitudes.size();
	}

	public void crearSolicitudDePrestamoPersonalPara_PorElMonto_En_Cuotas(Cliente cliente, double monto, int cuotas) {
		SolicitudDeCredito prestamoNuevo = new SolicitudPersonal(cliente, monto, cuotas);
		prestamoNuevo.actualizarAprobacion();
		this.listaDeSolicitudes.add(prestamoNuevo);
	}
}
