package ar.edu.unq.po2.tpComposite.ejShapeShifter;
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
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ObjetoShifterCompuesto implements IShapeShifter {
	
	private List<IShapeShifter> listaDeShifters;
	private int profundidad;

	public ObjetoShifterCompuesto(IShapeShifter shifter1,IShapeShifter shifter2) {
		this.listaDeShifters = Arrays.asList(shifter1, shifter2);
		this.profundidad = 1;
	}
	
	public ObjetoShifterCompuesto(List<IShapeShifter> listaDeShifters) {
		super();
		this.listaDeShifters = listaDeShifters;
		this.profundidad = 1;
	}



	@Override
	public List<Integer> values() {
		return this.listaDeShifters.stream().flatMap(shifter -> shifter.values().stream()).collect(Collectors.toList());
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		return new ObjetoShifterCompuesto(this, shapeShifter);
	}

	@Override
	public int deepest() {
		int deepest = this.listaDeShifters.stream().mapToInt(shifter -> shifter.deepest()).max().orElseThrow();
		return deepest + 1;
	}

	@Override
	public IShapeShifter flat() {
		List <IShapeShifter> listaShifters = this.listaDeShifters.stream().flatMap(shifter -> shifter.getListaShifter().stream()).collect(Collectors.toList());
		return new ObjetoShifterCompuesto(listaShifters);
	}

	public List<IShapeShifter> getListaShifter() {
		return listaDeShifters;
	}

	public void setListaDeShifters(List<IShapeShifter> listaDeShifters) {
		this.listaDeShifters = listaDeShifters;
	}
	
	
	
	
}
