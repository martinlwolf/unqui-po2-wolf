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
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class Municipio {
	
	private ArrayList<ActividadSemanal> listaDeActividades;

	public Municipio(ArrayList<ActividadSemanal> listaDeActividades) {
		super();
		this.listaDeActividades = listaDeActividades;
	}

	public ArrayList<ActividadSemanal> listaDeActividadesDe(Deporte deporte) {
		List <ActividadSemanal> lista= this.listaDeActividades
				.stream()
				.filter(actividad -> actividad.getDeporte() == deporte)
				.collect(Collectors.toList());
		return new ArrayList<ActividadSemanal>(lista);
	}

	public ArrayList<ActividadSemanal> listaDeActividadesConComplejidad(int complejidad) {
		List <ActividadSemanal> lista= this.listaDeActividades
				.stream()
				.filter(actividad -> actividad.complejidad() == complejidad)
				.collect(Collectors.toList());
		return new ArrayList<ActividadSemanal>(lista);
	}

	public int totalDeHorasEnActividades() {
		int totalHoras= this.listaDeActividades
				.stream()
				.mapToInt(actividad -> actividad.getDuracion())
				.sum();
		return totalHoras;
	}

	public ActividadSemanal actividadDeMinimoCosteDelDeporte_(Deporte deporte) {
		ActividadSemanal actividadDeMenorCoste = this.listaDeActividadesDe(deporte)
				.stream()
				.min((ActividadSemanal a1, ActividadSemanal a2)->a1.costeFinal().compareTo(a2.costeFinal())).get();
		return actividadDeMenorCoste;
	}

	public Map<Deporte, List<ActividadSemanal>> mapDeActividadesMasBaratas() {
		Map<Deporte, List<ActividadSemanal>> map = this.listaDeActividades.stream().collect(Collectors.groupingBy(actividad -> actividad.getDeporte()));
		return map;
	}
}