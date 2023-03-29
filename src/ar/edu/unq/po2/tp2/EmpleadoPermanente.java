package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	protected EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}
	
	private int cantidadDeHijos;
	private int antiguedad;
	
	
	@Override
	protected int sueldoBruto() {
		return (this.asignacionPorHijo() + this.asignacionPorConyuge() + this.bonoAntiguedad() + this.getSueldoBasico());
	}

	@Override
	protected int retenciones() {
		// TODO Auto-generated method stub
		return (this.costoObraSocial() + this.aportesJubilatorios());
	}

	
	public int asignacionPorHijo() {
		/**
		 * $150 por cada hijo
		 */
		return (this.getCantidadDeHijos()*150);
	}
	
	public int asignacionPorConyuge() {
		/**
		 * 100 si esta casado 0 si no
		 */
		if (this.getEstadoCivil() == "casado") {
			return 100;
		}
		else {
			return 0;
		}
	}
	
	public int bonoAntiguedad() {
		/**
		 * $50 por cada año de antiguedad
		 */
		return (this.getAntiguedad() * 50);
	}
	
	public int costoObraSocial() {
		/**
		 * 10% del sueldo bruto y $20 por cada hijo
		 */
		return (int)((this.sueldoBruto() * 0.10) + (this.getCantidadDeHijos() * 20));
	}
	
	public int aportesJubilatorios() {
		/**
		 * 15% del sueldo bruto
		 */
		return (int)(this.sueldoBruto() * 0.15);
	}
	
	/**
	 * 
	 * getters y setters
	 */

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	

}
