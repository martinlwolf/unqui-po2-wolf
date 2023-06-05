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


public class ServidorEncuentros implements SistemaObserver{
	private List<String> deportesDePreferencia;
	private List<Encuentro> encuentrosNotificados;

	public boolean cumpleCondicionParaNotificar(Encuentro encuentro) {
		return this.deportesDePreferencia.contains(encuentro.getDeporte());
	}

	@Override
	public void update(Encuentro encuentro) {
		this.encuentrosNotificados.add(encuentro);
	}

	public List<String> getDeportesDePreferencia() {
		return deportesDePreferencia;
	}

	public void setDeportesDePreferencia(List<String> deportesDePreferencia) {
		this.deportesDePreferencia = deportesDePreferencia;
	}

	public List<Encuentro> getEncuentrosNotificados() {
		return encuentrosNotificados;
	}

	public void setEncuentrosNotificados(List<Encuentro> encuentrosNotificados) {
		this.encuentrosNotificados = encuentrosNotificados;
	}
	
	
	
	
}
