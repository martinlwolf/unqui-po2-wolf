package ar.edu.unq.po2.tp4;

import java.time.Month;

public class IngresoCorriente extends Ingreso {

	public IngresoCorriente(Month mesDePercepcion, String concepto, double monto) {
		super(mesDePercepcion, concepto, monto);
	}
	
	@Override
	protected double montoEnImpuestosAPagar() {
		return this.getMonto() * 0.02;
	}



}
