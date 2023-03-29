package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, String metodoDePago, int numeroDeContrato) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.metodoDePago = metodoDePago;
		this.numeroDeContrato = numeroDeContrato;
	}

	private String metodoDePago;
	private int numeroDeContrato;

	@Override
	protected int sueldoBruto() {
		return this.sueldoBasico;
	}

	@Override
	protected int retenciones() {
		/**
		 * $50 por gastos administrativos contractuales
		 */
		return 50;
	}

}
