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


import java.util.List;

public class EventManagerSistema {
	private List<MiembroDeLaboratorio> observers;
	public EventManagerSistema() {
		super();
		this.observers = new ArrayList<MiembroDeLaboratorio>();
	}

	public void notificarObservers(ArticuloCientifico articulo) {
		this.observers.stream().forEach(observer -> this.notificarSiCorrespondeA(observer, articulo));
	}

	public void notificarSiCorrespondeA(MiembroDeLaboratorio observer, ArticuloCientifico articulo) {
		if(this.cumpleLosFiltros(observer, articulo)) {
			this.notify(observer);
		}
	}

	private boolean cumpleLosFiltros(MiembroDeLaboratorio observer, ArticuloCientifico articulo) {
		return observer.getListaDeFiltros().stream().allMatch(filtro -> filtro.cumpleFiltro(articulo));
	}

	private void notify(MiembroDeLaboratorio observer) {
		observer.update();
	}

	public void agregarObserver(MiembroDeLaboratorio miembro) {
		this.observers.add(miembro);
		
	}

	public void eliminarObserver(MiembroDeLaboratorio miembro) {
		this.observers.remove(miembro);
	}
}
