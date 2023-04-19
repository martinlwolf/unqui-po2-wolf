package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
	private double tasaDelServicio;

	public Impuesto(double tasaDelServicio) {
		super();
		this.tasaDelServicio = tasaDelServicio;
	}

	@Override
	public double costoFinalYRestarStock() {
		// TODO Auto-generated method stub
		return this.tasaDelServicio;
	}

}
