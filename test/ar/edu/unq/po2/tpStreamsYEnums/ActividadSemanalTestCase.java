package ar.edu.unq.po2.tpStreamsYEnums;
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

public class ActividadSemanalTestCase {
	
	private ActividadSemanal actividadLunes;
	private ActividadSemanal actividadSabado;
	
	@BeforeEach
	public void setUp() {
		actividadLunes = new ActividadSemanal(DiaDeLaSemana.Lunes, 15, 2, Deporte.RUNNING);
		actividadSabado = new ActividadSemanal(DiaDeLaSemana.Sabado, 20, 4, Deporte.JABALINA);
	}
	
	@Test
	public void testCosteDeActividadRunningLunes2Horas() {
		assertEquals(1200, actividadLunes.costeFinal());
	}
	
	@Test
	public void testCosteDeActividadJabalinaSabado4Horas() {
		assertEquals(4800, actividadSabado.costeFinal());
	}
}
