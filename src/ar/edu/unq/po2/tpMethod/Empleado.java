package ar.edu.unq.po2.tpMethod;

public abstract class Empleado {
	
	protected double sueldoBasico;
	protected int cantidadDeHijos;
	protected boolean estaCasado;
	protected int horasTrabajadas;

	
	
	public Empleado(int cantidadDeHijos, boolean estaCasado, int horasTrabajadas) {
		super();
		this.cantidadDeHijos = cantidadDeHijos;
		this.estaCasado = estaCasado;
		this.horasTrabajadas = horasTrabajadas;
	}

	public final double sueldo() {
		double sueldoAntesDeAporte = this.sueldoBasico() + this.pagoPorHora() + this.bonoPorHijos();
		return sueldoAntesDeAporte - (sueldoAntesDeAporte * 0.13);
	}

	public double sueldoBasico() {
		return this.sueldoBasico;
	}

	public abstract double pagoPorHora();

	public abstract double bonoPorHijos();

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	

	
	
}
