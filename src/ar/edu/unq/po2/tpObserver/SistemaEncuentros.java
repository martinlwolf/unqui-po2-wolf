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


public class SistemaEncuentros {
	private EventManagerEncuentros eventManager;
	private List<Encuentro> listaDeEncuentros;
	
	public void agregarEncuentro(Encuentro encuentro) {
		this.listaDeEncuentros.add(encuentro);
		this.eventManager.notificarObservers(encuentro);
	}
	
}
