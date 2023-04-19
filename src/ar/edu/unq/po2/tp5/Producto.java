package ar.edu.unq.po2.tp5;

public abstract class Producto implements Pagable {
	
	protected String nombre;
	protected double precio;
	protected int stock;
	
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void aumentarStockEn(int stockAAgregar) {
		this.stock = this.stock + stockAAgregar;
		
	}
	
	public void disminuirStockEn(int stockADisminuir) {
		this.stock = this.stock - stockADisminuir;
		
	}

	public abstract double costoFinalYRestarStock() ;
	
	

}
