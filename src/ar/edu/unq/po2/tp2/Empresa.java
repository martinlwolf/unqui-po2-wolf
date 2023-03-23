package ar.edu.unq.po2.tp2;

public class Empresa {
	private String nombre;
	private int cuil;
	/*private [] empleados*/
	
	public Empresa(String nombre, int cuil) {
		super();
		this.nombre = nombre;
		this.cuil = cuil;
	}

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
	
	/*public void agregarEmpleados(Empleado []) {
		
	}*/
	
	
	
}
