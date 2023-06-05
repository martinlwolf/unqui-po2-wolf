package ar.edu.unq.po2.tpObserverEj3;
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


public class Concurso {
	private boolean estaActivo;
	private List<Jugador> jugadores;
	public void recibirSolicitudDe(Jugador jugador) {
		if(jugadores.size() < 5) {
			jugador.setConcursoEnElQueParticipa(this);
			jugador.setRecibioAceptacion(true);
		}
		else {
			jugador.setRecibioAceptacion(false);
		}
	}
}
