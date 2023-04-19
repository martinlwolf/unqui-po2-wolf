package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto  {
	
	

	public ProductoCooperativa(String nombre, int precio) {
		super(nombre, precio);
		this.setStock(0);
	}

	@Override
	public double costoFinalYRestarStock() {
		this.disminuirStockEn(1);
		return this.precio * 0.90;
	}

}
