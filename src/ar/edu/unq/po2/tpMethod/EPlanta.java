package ar.edu.unq.po2.tpMethod;

public class EPlanta extends Empleado {
	
	

	public EPlanta(int cantidadDeHijos, boolean estaCasado, int horasTrabajadas) {
		super(cantidadDeHijos, estaCasado, horasTrabajadas);
		this.sueldoBasico = 3000;
	}

	@Override
	public double bonoPorHijos() {
		// TODO Auto-generated method stub
		return this.cantidadDeHijos * 150;
	}

	@Override
	public double pagoPorHora() {
		// TODO Auto-generated method stub
		return 0;
	}

}
