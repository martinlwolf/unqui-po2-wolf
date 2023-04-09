package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Producto {
	String nombreDelProducto;
	double precio;
	boolean esPrecioCuidado;
	double porcentajeDeDescuento;
	
	public Producto(String nombreDelProducto, double precio, boolean esPrecioCuidado, double porcentajeDeDescuento) {
		super();
		this.nombreDelProducto = nombreDelProducto;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
		this.porcentajeDeDescuento = porcentajeDeDescuento;
	}
	
	public void cambiarPorcentajeDeDescuento(double nuevoPorcentaje) {
		this.porcentajeDeDescuento = nuevoPorcentaje;
	}
	
	
}
