package ar.edu.unq.po2.tp4;

import java.time.Month;

public class IngresoExtra extends Ingreso {
	private int cantidadHorasExtras;

	public IngresoExtra(Month mesDePercepcion, String concepto, double monto, int cantidadHorasExtras) {
		super(mesDePercepcion, concepto, monto);
		this.cantidadHorasExtras = cantidadHorasExtras;
	}
	
	@Override
	protected double montoEnImpuestosAPagar() {
		
		return 0;
	}
	
	
}
