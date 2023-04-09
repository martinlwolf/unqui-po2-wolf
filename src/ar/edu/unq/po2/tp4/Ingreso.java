package ar.edu.unq.po2.tp4;

import java.time.Month;

public abstract class Ingreso {
	private Month mesDePercepcion;
	private String concepto;
	private double monto;
	
	public Ingreso(Month mesDePercepcion, String concepto, double monto) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	
	
	public double getMonto() {
		return monto;
	}



	public void setMonto(double monto) {
		this.monto = monto;
	}



	protected abstract double montoEnImpuestosAPagar();
	
}
