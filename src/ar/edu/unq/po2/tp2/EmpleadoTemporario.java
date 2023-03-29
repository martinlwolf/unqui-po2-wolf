package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	protected EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico, LocalDate fechaFinDesignacionPlanta, int cantidadHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.fechaFinDesignacionPlanta = fechaFinDesignacionPlanta;
		this.cantidadHorasExtras = cantidadHorasExtras;
		
	}

	private LocalDate fechaFinDesignacionPlanta;
	private int cantidadHorasExtras;
	
	
	@Override
	protected int sueldoBruto() {
		/**
		 * $40 por cada hora extra
		 */
		return (this.getCantidadHorasExtras() * 40 + this.getSueldoBasico());
	}

	@Override
	protected int retenciones() {
		/**
		 * Obra social + jubilacion
		 */
		return (this.costoObraSocial() + this.aportesJubilatorios());
	}

	public int costoObraSocial() {
		/**
		 * 10% del sueldo bruto + $25 extra si tiene mas de 50 años de edad
		 */
		return (int)((this.sueldoBruto() * 0.10) + this.extraDe25PorEdad());
	}
	
	public int aportesJubilatorios() {
		/**
		 *  10% del sueldo bruto y $5 por cada hora extra
		 */
		return (int)((this.sueldoBruto() * 0.10) + (this.getCantidadHorasExtras() * 5));
	}
	
	public int extraDe25PorEdad() {
		/**
		 * Si el empleado tiene mas de 50 años, devuelve 25, sino 0
		 */
		if (this.edad() > 50) {
			return (25);
		}
		else {
			return 0;
		}
	}
	
	/**
	 * 
	 * Getters y setters
	 */

	public LocalDate getFechaFinDesignacionPlanta() {
		return fechaFinDesignacionPlanta;
	}

	public void setFechaFinDesignacionPlanta(LocalDate fechaFinDesignacionPlanta) {
		this.fechaFinDesignacionPlanta = fechaFinDesignacionPlanta;
	}

	public int getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}

	public void setCantidadHorasExtras(int cantidadHorasExtras) {
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	

}
