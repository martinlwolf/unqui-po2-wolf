package ar.edu.unq.po2.tpStreamsYEnums;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class MunicipioTestCase {
	private Municipio municipio;
	private ArrayList<ActividadSemanal> listaActividades;
	@Mock private ActividadSemanal actividad1;
	@Mock private ActividadSemanal actividad2;
	@Mock private ActividadSemanal actividad3;
	@Mock private ActividadSemanal actividad4;
	
	@BeforeEach
	public void setUp() {
		actividad1 = mock(ActividadSemanal.class);
		actividad2 = mock(ActividadSemanal.class);
		actividad3 = mock(ActividadSemanal.class);
		actividad4 = mock(ActividadSemanal.class);
		listaActividades = new ArrayList<ActividadSemanal>(Arrays.asList(actividad1, actividad2, actividad3, actividad4));
		municipio = new Municipio(listaActividades);
	}
	
	@Test
	public void testDevuelveUnaListaConLasActividadesDeFutbol() {
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.FUTBOL);
		assertEquals(Arrays.asList(actividad1, actividad2), municipio.listaDeActividadesDe(Deporte.FUTBOL));
	}
	
	@Test
	public void testDevuelveUnaListaConLasActividadesQueTienenUnaComplejidadDeterminada() {
		when(actividad1.complejidad()).thenReturn(2);
		when(actividad2.complejidad()).thenReturn(2);
		assertEquals(Arrays.asList(actividad1, actividad2), municipio.listaDeActividadesConComplejidad(2));
	}
	
	@Test
	public void testDevuelveUnaListaConElTotalDeHorasQueTienenLasActividades() {
		when(actividad1.getDuracion()).thenReturn(2);
		when(actividad2.getDuracion()).thenReturn(4);
		when(actividad3.getDuracion()).thenReturn(1);
		when(actividad4.getDuracion()).thenReturn(3);
		assertEquals(10, municipio.totalDeHorasEnActividades());
	}
	
	@Test
	public void testDevuelveLaActividadConElMinimoCosteDeUnDeterminadoDeporte() {
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad3.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad4.getDeporte()).thenReturn(Deporte.RUNNING);
		when(actividad1.costeFinal()).thenReturn((double) 1500);
		when(actividad2.costeFinal()).thenReturn((double) 700);
		when(actividad3.costeFinal()).thenReturn((double) 300);
		when(actividad4.costeFinal()).thenReturn((double) 500);
		ActividadSemanal actividad = municipio.actividadDeMinimoCosteDelDeporte_(Deporte.FUTBOL);
		assertEquals(actividad3, actividad);
	}
	
	@Test
	public void testDevuelveUnMapConLaActividadMasBarataDeCadaDeporte() {
		when(actividad1.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad2.getDeporte()).thenReturn(Deporte.FUTBOL);
		when(actividad3.getDeporte()).thenReturn(Deporte.RUNNING);
		when(actividad4.getDeporte()).thenReturn(Deporte.RUNNING);
		when(actividad1.costeFinal()).thenReturn((double) 1500);
		when(actividad2.costeFinal()).thenReturn((double) 700);
		when(actividad3.costeFinal()).thenReturn((double) 300);
		when(actividad4.costeFinal()).thenReturn((double) 500);
		
		assertEquals(actividad3, municipio.mapDeActividadesMasBaratas());
	}
}
