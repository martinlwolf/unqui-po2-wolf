package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected LocalDate fechaDeNacimiento;
	protected int sueldoBasico;
	
	
	
	protected Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int edad() {
		return (Period.between( this.fechaDeNacimiento, LocalDate.now()).getYears());
	}
	
	/**
	 * 
	 * Getters y setters
	 */
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	protected abstract int sueldoBruto();
	
	protected abstract int retenciones();
	
	public int sueldoNeto() {
		return (this.sueldoBruto() - this.retenciones());
	}
	
	
}
