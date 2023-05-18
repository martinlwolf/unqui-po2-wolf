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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

public class ObjetoShifter implements IShapeShifter {
	
	protected int value;
	protected int profundidad;
	
	
	public ObjetoShifter(int value) {
		super();
		this.value = value;
		this.profundidad = 0;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shifter) {
		return new ObjetoShifterCompuesto(this, shifter);
	}

	@Override
	public int deepest() {
		return this.profundidad;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return Arrays.asList(this.value);
	}

	@Override
	public List<IShapeShifter> getListaShifter() {
		// TODO Auto-generated method stub
		return Arrays.asList(this);
	}
	
	

}
