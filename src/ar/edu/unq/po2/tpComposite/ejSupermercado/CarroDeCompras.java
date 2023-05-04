package ar.edu.unq.po2.tpComposite.ejSupermercado;

import java.util.List;

public class CarroDeCompras {
	private List<Producto> listaDeProductos;
	
	public CarroDeCompras(List<Producto> lista) {
		this.listaDeProductos = lista;
	}
	
	public double total() {
		return this.listaDeProductos.stream()
		.mapToDouble(producto -> producto.getPrecio()).sum();
	}

}
