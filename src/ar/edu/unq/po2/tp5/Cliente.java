package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Cliente {
	
	private ArrayList<Pagable> listaDeCompras;
	
	

	public Cliente() {
		super();
		listaDeCompras = new ArrayList<Pagable>();
	}



	public double montoAPagarPorSusProductosEnMercado_(MercadoCentral mercado) {
		return mercado.registrarProductos(listaDeCompras);
	}



	public void agregarProductoDelMercado_ConNombre_ALaLista(MercadoCentral mercado, String nombre) {
		if(mercado.existeElProductoConNombre_(nombre) & mercado.tieneStockDeProductoConNombre_(nombre)) {
			listaDeCompras.add(mercado.productoConNombre_(nombre));
		}
	}

}
