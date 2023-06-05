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


public class MiembroDeLaboratorio {
	private List<FiltroCriterioArticulo> listaDeFiltros;
	private int cantidadDeNotificacionesRecibidas;
	public List<FiltroCriterioArticulo> getListaDeFiltros() {
		return listaDeFiltros;
	}
	public void setListaDeFiltros(List<FiltroCriterioArticulo> listaDeFiltros) {
		this.listaDeFiltros = listaDeFiltros;
	}
	public int getCantidadDeNotificacionesRecibidas() {
		return cantidadDeNotificacionesRecibidas;
	}
	public void setCantidadDeNotificacionesRecibidas(int cantidadDeNotificacionesRecibidas) {
		this.cantidadDeNotificacionesRecibidas = cantidadDeNotificacionesRecibidas;
	}
	public void update() {
		this.cantidadDeNotificacionesRecibidas = this.cantidadDeNotificacionesRecibidas + 1;
	}
	
	
}
