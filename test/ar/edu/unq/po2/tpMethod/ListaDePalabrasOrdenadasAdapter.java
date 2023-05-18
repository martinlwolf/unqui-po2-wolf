package ar.edu.unq.po2.tpMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ListaDePalabrasOrdenadasAdapter /*implements DefaultListModel*/{
	private ListaDePalabrasOrdenadas listaPalabras;
	
	public ListaDePalabrasOrdenadasAdapter() {
		super();
		this.listaPalabras = new ListaDePalabrasOrdenadas();
	}

	public void addElement(String string) {
		this.listaPalabras.agregarPalabra(string);
	}
	
	public Integer cantidadDePalabras(){
		return listaPalabras.cantidadDePalabras();
		}
	public String getPalabraDePosicion(int posicion){
		return this.listaPalabras.getPalabraDePosicion(posicion);
		}
}
