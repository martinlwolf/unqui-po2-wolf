package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
	private double costoPorUnidad;
	private double unidadesConsumidas;
	
	

	public Servicio(double costoPorUnidad, double unidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}

	@Override
	public double costoFinalYRestarStock() {
		
		return costoPorUnidad * unidadesConsumidas;
	}
}
