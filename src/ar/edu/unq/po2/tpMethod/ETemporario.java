package ar.edu.unq.po2.tpMethod;

public class ETemporario extends Empleado {
	
	
	
	public ETemporario(int cantidadDeHijos, boolean estaCasado, int horasTrabajadas) {
		super(cantidadDeHijos, estaCasado, horasTrabajadas);
		this.sueldoBasico = 1000;
	}

	public double bonoPorHijos() {
		if(this.cantidadDeHijos > 0 || this.estaCasado) {
			return 100;
		}
		else return 0;
	}

	@Override
	public double pagoPorHora() {
		return this.horasTrabajadas * 5;
	}

}
