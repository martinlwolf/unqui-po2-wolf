package ar.edu.unq.po2.tpStateStrategy.ejEncriptacion;
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

public class EncriptadorNaive {
	
	private MetodoDeEncriptacion metodo;

	public MetodoDeEncriptacion getMetodo() {
		return metodo;
	}

	public void setMetodo(MetodoDeEncriptacion metodo) {
		this.metodo = metodo;
	}

	public String encriptar(String string) {
		return this.metodo.encriptar(string);
	}
	
	
}
