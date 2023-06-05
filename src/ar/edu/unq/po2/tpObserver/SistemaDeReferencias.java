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


public class SistemaDeReferencias {
	private EventManagerSistema eventManager;
	private List<ArticuloCientifico> listaDeArticulos;
	
	
	
	public SistemaDeReferencias() {
		super();
		this.eventManager = new EventManagerSistema();
		this.listaDeArticulos = new ArrayList<ArticuloCientifico>();
	}

	public void agregarArticulo(ArticuloCientifico articulo) {
		this.listaDeArticulos.add(articulo);
		this.eventManager.notificarObservers(articulo);
	}

	public EventManagerSistema getEventManager() {
		return eventManager;
	}

	public void setEventManager(EventManagerSistema eventManager) {
		this.eventManager = eventManager;
	}
	
	public int cantidadDeArticulos() {
		return this.listaDeArticulos.size();
	}
	
	public void agregarObserver(MiembroDeLaboratorio miembro) {
		this.eventManager.agregarObserver(miembro);
	}
	
	public void eliminarObserver(MiembroDeLaboratorio miembro) {
		this.eventManager.eliminarObserver(miembro);
	}
}
