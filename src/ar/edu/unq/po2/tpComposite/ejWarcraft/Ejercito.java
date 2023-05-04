package ar.edu.unq.po2.tpComposite.ejWarcraft;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tp3.Punto;

public class Ejercito extends Soldado{
	private ArrayList<Soldado> soldados;

	public Ejercito(Punto punto) {
		super();
		this.soldados = new ArrayList<Soldado>();
		this.ubicacion = punto;
	}

	public void agregarSoldado(Soldado soldado) {
		this.soldados.add(soldado);
		soldado.moverA(this.ubicacionActual());
	}

	public int cantidadDeSoldados() {
		return this.soldados.size();
	}

	@Override
	protected void moverA(Punto punto) {
		this.ubicacion = punto;
		this.soldados.stream().forEach(soldado -> soldado.moverA(this.ubicacionActual()));
		
	}

	public ArrayList<Soldado> soldados() {
		return this.soldados;
	}
}
