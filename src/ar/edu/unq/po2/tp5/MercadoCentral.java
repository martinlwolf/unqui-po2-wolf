package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MercadoCentral {
	private ArrayList<Pagable> listaDeProductos;
	
	
	
	public MercadoCentral() {
		super();
		listaDeProductos = new ArrayList<Pagable>();
	}

	public void añadirProductoTradicionalConNombre_YPrecio(String nombre, int precio) {
		Pagable productoNuevo = new ProductoTradicional(nombre, precio);
		listaDeProductos.add(productoNuevo);
	}
	
	public void añadirProductoCooperativaConNombre_YPrecio(String nombre, int precio) {
		Pagable productoNuevo = new ProductoCooperativa(nombre, precio);
		listaDeProductos.add(productoNuevo);
	}


	public int cantidadDeProductos() {
		return listaDeProductos.size();
	}
	
	public void aumentarStockEn_AProductoConNombre(int stockAAgregar, String nombreDeProducto) {
		/*(ProveedorDeStock.proveedorParaAumentarStockDeProductoConNombre(nombreDeProducto)).aumentarStockEn_AProductoConNombre(int stockAAgregar, String nombreDeProducto)*/
		if(this.existeElProductoConNombre_(nombreDeProducto)) {
			this.productoConNombre_(nombreDeProducto).aumentarStockEn(stockAAgregar);
		}
	}

	public boolean existeElProductoConNombre_(String nombreDeProducto) {
		return listaDeProductos.stream().anyMatch(producto -> producto.getNombre().equals(nombreDeProducto));
	}

	public Pagable productoConNombre_(String nombreDeProducto) {
		return listaDeProductos.stream().filter(producto -> producto.getNombre().equals(nombreDeProducto)).findFirst().get();
	}

	public int stockDeProductoConNombre(String nombre) {
		return this.productoConNombre_(nombre).getStock();
	}

	/*public double registrarProductos(ArrayList<Producto> listaDeCompras) {
		listaDeCompras.stream().forEach(producto -> this.productoConNombre_(producto.getNombre()).disminuirStockEn(1));
		double costoTotal = listaDeCompras.stream().mapToDouble(producto -> producto.costoFinal()).sum();
		return costoTotal;
	} VIEJO*/
	
	public double registrarProductos(ArrayList<Pagable> listaDeCompras) {
		double costoTotal = listaDeCompras.stream().mapToDouble(pagable -> this.registrarProducto(pagable)).sum();
		return costoTotal;
	}
	public double registrarProducto(Pagable pagable) {
		return pagable.costoFinalYRestarStock();
	}

	public boolean tieneStockDeProductoConNombre_(String nombre) {
		return this.productoConNombre_(nombre).getStock() > 0;
	}

}
