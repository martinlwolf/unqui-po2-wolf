package ar.edu.unq.po2.tpComposite.ejCultivos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class PorcionMixta extends Porcion {
	
	private List<Porcion> porcionesDivididas;

	public PorcionMixta(List<Porcion> listaDePorciones) {
		this.porcionesDivididas = listaDePorciones;
		this.subDivisionesHechas = 1;
		this.transmitirDivisiones();
	}

	public void transmitirDivisiones() {
		this.porcionesDivididas.stream().forEach(porcion -> porcion.agregarDivision());
	}
	
	public void agregarDivision() {
		this.subDivisionesHechas = this.subDivisionesHechas + 1;
		this.porcionesDivididas.stream().forEach(porcion -> porcion.agregarDivision());
	}

	@Override
	public double gananciaAnual() {
		List<Porcion> porciones = this.porcionesDivididas;
			return porciones.stream().mapToDouble(porcion -> porcion.gananciaAnual()).sum();
		
	}

}
