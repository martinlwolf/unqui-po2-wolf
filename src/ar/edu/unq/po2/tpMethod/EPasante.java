package ar.edu.unq.po2.tpMethod;

public class EPasante extends Empleado {
	
	

	public EPasante(int cantidadDeHijos, boolean estaCasado, int horasTrabajadas) {
		super(cantidadDeHijos, estaCasado, horasTrabajadas);
		this.sueldoBasico = 0;
	}

	@Override
	public double bonoPorHijos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pagoPorHora() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas * 40;
	}

}
