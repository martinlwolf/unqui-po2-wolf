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
public class PorcionSoja extends Porcion {
	
	

	public PorcionSoja() {
		this.subDivisionesHechas = 0;
	}

	@Override
	public double gananciaAnual() {
		if(this.subDivisionesHechas == 0) {
			return this.gananciaBase();
		}
		else {
			return this.gananciaBase() / (Math.pow(4,this.subDivisionesHechas));
		}
	}
	
	public double gananciaBase() {
		return 2000;
	}
	

}
