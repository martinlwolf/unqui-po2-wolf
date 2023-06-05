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


public class EventManagerEncuentros {
	private List<SistemaObserver> observers;
	
	

	public EventManagerEncuentros() {
		super();
		this.observers = new ArrayList<SistemaObserver>();
	}

	public void notificarObservers(Encuentro encuentro) {
		this.observers.stream().forEach(observer -> this.notificarSiCorrespondeA(observer, encuentro));
	}

	public void notificarSiCorrespondeA(SistemaObserver observer, Encuentro encuentro) {
		if(observer.cumpleCondicionParaNotificar(encuentro)) {
			this.notificar(observer, encuentro);
		}
	}

	
	private void notificar(SistemaObserver observer, Encuentro encuentro) {
		observer.update(encuentro);
	}
	
	public void agregarObserver(SistemaObserver observer) {
		this.observers.add(observer);
	}

	public List<SistemaObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<SistemaObserver> observers) {
		this.observers = observers;
	}
	
	
	
	
}
