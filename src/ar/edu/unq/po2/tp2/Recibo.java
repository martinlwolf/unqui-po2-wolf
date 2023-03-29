package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Recibo {
	String nombreDelEmpleado;
	String direccion;
	LocalDate fechaDeEmision;
	int sueldoBruto;
	int sueldoNeto;


	public Recibo(Empleado empleado) {
		/**
		 * Constructor que crea una instancia a partir de los datos de un empleado
		 */
		super();
		this.nombreDelEmpleado = empleado.getNombre();
		this.direccion = empleado.getDireccion();
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = empleado.sueldoBruto();
		this.sueldoNeto = empleado.sueldoNeto();
	}

	/**
	 * 
	 * Getters y setters
	 */
	public String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}
	public void setNombreDelEmpleado(String nombreDelEmpleado) {
		this.nombreDelEmpleado = nombreDelEmpleado;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}
	public void setFechaDeEmision(LocalDate fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}
	public int getSueldoBruto() {
		return sueldoBruto;
	}
	public void setSueldoBruto(int sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	public int getSueldoNeto() {
		return sueldoNeto;
	}
	public void setSueldoNeto(int sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}
	
	
	
}
