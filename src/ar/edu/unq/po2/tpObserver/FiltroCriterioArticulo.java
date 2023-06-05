package ar.edu.unq.po2.tpObserver;
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

public class FiltroCriterioArticulo {
	private String campo;
	private String valor;
	public FiltroCriterioArticulo(String campo, String valor) {
		super();
		this.campo = campo;
		this.valor = valor;
	}
	
	public boolean cumpleFiltro(ArticuloCientifico articulo) {
		return articulo.getCampo(this.campo).equals(this.valor);
	}
	public String getCampo() {
		return campo;
	}
	public String getValor() {
		return valor;
	}
	
	
}
