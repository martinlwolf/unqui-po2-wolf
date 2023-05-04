package ar.edu.unq.po2.tpComposite.ejCultivos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public abstract class Porcion {
	
	protected int subDivisionesHechas;
	
	
	
	public Porcion() {
		this.subDivisionesHechas = 0;
	}



	public abstract double gananciaAnual();



	public void agregarDivision() {
		this.subDivisionesHechas = this.subDivisionesHechas + 1;
	}
}
