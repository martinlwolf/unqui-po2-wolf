package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}

	public void solicitarPrestamoPersonalDe_EnBanco_En_Cuotas(double monto, Banco banco, int cantidadDeCuotas) {
		banco.crearSolicitudDePrestamoPersonalPara_PorElMonto_En_Cuotas(this, monto, cantidadDeCuotas);
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
