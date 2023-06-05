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


public class Jugador{
	private boolean recibioAceptacion;
	private Concurso concursoEnElQueParticipa;
	
	public void solicitarSumarseA(Concurso concurso) {
		concurso.recibirSolicitudDe(this);
	}

	public boolean isRecibioAceptacion() {
		return recibioAceptacion;
	}

	public void setRecibioAceptacion(boolean recibioAceptacion) {
		this.recibioAceptacion = recibioAceptacion;
	}

	public Concurso getConcursoEnElQueParticipa() {
		return concursoEnElQueParticipa;
	}

	public void setConcursoEnElQueParticipa(Concurso concursoEnElQueParticipa) {
		this.concursoEnElQueParticipa = concursoEnElQueParticipa;
	}
	
	
}
