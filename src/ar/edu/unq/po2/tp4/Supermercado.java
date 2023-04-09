package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {
	String nombre;
	Direccion direccion;
	ArrayList<Producto> productos;
	
	public Supermercado(String nombre, Direccion direccion, ArrayList<Producto> productos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}
	
	public double costoTotalDeProductos() {
		double costoTotal = this.productos.stream().mapToDouble(producto -> this.precioFinalDe(producto)).sum();
		return costoTotal;
	}
	
	public double precioFinalDe(Producto producto) {
		if (producto.esPrecioCuidado) {
			return (producto.precio - (producto.precio * (producto.porcentajeDeDescuento / 100)));
		}
		return producto.precio;
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
}
