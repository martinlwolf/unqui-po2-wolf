package ar.edu.unq.po2.tp2;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private int cuil;
	private ArrayList<Empleado> empleados;
	private ArrayList<Recibo> recibos;
	
	
	public Empresa(String nombre, int cuil, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.cuil = cuil;
		this.empleados = empleados;
		this.recibos = new ArrayList<Recibo>();
	}

	public int totalSueldosBrutos() {
		int totalSueldoBruto = 0;
		for(Empleado empleado : this.empleados) {
			totalSueldoBruto = totalSueldoBruto + empleado.sueldoBruto();
		}
		return totalSueldoBruto;
	}
	
	public int totalRetenciones() {
		int totalRetenciones = 0;
		for(Empleado empleado : this.empleados) {
			totalRetenciones = totalRetenciones + empleado.retenciones();
		}
		return totalRetenciones;
	}
	
	public int totalSueldosNetos() {
		int totalSueldoNeto = 0;
		for(Empleado empleado : this.empleados) {
			totalSueldoNeto = totalSueldoNeto + empleado.sueldoNeto();
		}
		return totalSueldoNeto;
	}
	
	public void liquidarDeSueldos() {
		for(Empleado empleado : this.empleados) {
			this.recibos.add(new Recibo(empleado));
		}
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

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public ArrayList<Recibo> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<Recibo> recibos) {
		this.recibos = recibos;
	}
	
	
	
	
}
