package ar.edu.unq.po2.tpState;
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
import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class Maquina {
	private EstadoFichas estadoFichasActual;

	public Maquina() {
		super();
		this.estadoFichasActual = new EstadoSinFichas(this);
	}

	public String presionarBoton() {
		return this.estadoFichasActual.presionarBoton();
	}

	public boolean estaSinFichas() {
		return this.estadoFichasActual.esSinFichas();
	}

	public boolean estaCon1Ficha() {
		return this.estadoFichasActual.esCon1Ficha();
	}
	public boolean estaCon2Fichas() {
		return this.estadoFichasActual.esCon2Fichas();
	}

	public void ingresarFicha() {
		this.estadoFichasActual.ingresarFicha();
	}

	public EstadoFichas getEstadoFichasActual() {
		return estadoFichasActual;
	}

	public void setEstadoFichasActual(EstadoFichas estadoFichasActual) {
		this.estadoFichasActual = estadoFichasActual;
	}
	
}
