package ar.edu.unq.po2.tp2;

public abstract class Empleado {
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected String fechaDeNacimiento;
	protected int sueldoBasico;
	
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
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	protected abstract int calcularSueldoBruto();
	
	protected abstract int calcularRetenciones();
	
	protected abstract int calcularSueldoNeto();
	
	
}
