package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresos;

	public Trabajador(ArrayList<Ingreso> ingresos) {
		super();
		this.ingresos = ingresos;
	}
	
	public void añadirIngreso(Ingreso ingresoNuevo) {
		this.ingresos.add(ingresoNuevo);
	}

	public double getImpuestoAPagar() {
		double impuestoTotal = this.ingresos.stream().mapToDouble(ingreso -> ingreso.montoEnImpuestosAPagar()).sum();
		return impuestoTotal;
	}

	public double getTotalPercibido() {
		double totalPercibido = this.ingresos.stream().mapToDouble(ingreso -> ingreso.getMonto()).sum();
		return totalPercibido;
	}

	public double getMontoImponible() {
		double montoImponible = this.ingresos.stream().mapToDouble(ingreso -> this.montoImponibleDe(ingreso)).sum();
		return montoImponible;
	}

	private double montoImponibleDe(Ingreso ingreso) {
		double monto = ingreso.getMonto() - ingreso.montoEnImpuestosAPagar();
		return monto;
	}
	
}
