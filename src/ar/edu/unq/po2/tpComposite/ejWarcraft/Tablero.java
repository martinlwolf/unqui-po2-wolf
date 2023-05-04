package ar.edu.unq.po2.tpComposite.ejWarcraft;

import java.util.ArrayList;

import ar.edu.unq.po2.tp3.Punto;

public class Tablero {
	
	private ArrayList<Punto> listaDeCoordenadas;

	public Tablero(ArrayList<Punto> listaDeCoordenadas) {
		super();
		this.listaDeCoordenadas = listaDeCoordenadas;
	}

	public ArrayList<Punto> getListaDeCoordenadas() {
		return listaDeCoordenadas;
	}

	public void setListaDeCoordenadas(ArrayList<Punto> listaDeCoordenadas) {
		this.listaDeCoordenadas = listaDeCoordenadas;
	}
	
	
	
}
