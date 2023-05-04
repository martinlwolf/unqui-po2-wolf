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

public class PorcionTestCase {
	private Porcion porcionSoja1;
	private Porcion porcionTrigo1;
	private Porcion porcionSoja2;
	private Porcion porcionTrigo2;
	
	@BeforeEach
	public void setUp() {
		this.porcionSoja1 = new PorcionSoja();
		this.porcionSoja2 = new PorcionSoja();
		this.porcionTrigo1 = new PorcionTrigo();
		this.porcionTrigo2 = new PorcionTrigo();
		/*this.porcionMixta1 = new PorcionMixta(Arrays.asList(porcionSoja1, porcionSoja2, porcionTrigo1, porcionTrigo2));
		this.porcionMixta2 = new PorcionMixta(Arrays.asList(porcionSoja2, porcionTrigo1, porcionTrigo2, porcionMixta1));*/
		
	}
	
	@Test
	public void testGananciaAnualSoja() {
		assertEquals(2000, porcionSoja1.gananciaAnual());
	}
	
	@Test
	public void testGananciaAnualTrigo() {
		assertEquals(1200,porcionTrigo1.gananciaAnual());
	}
	
	@Test
	public void testGananciaAnualMixtaCon2Trigo2Soja() {
		Porcion porcionMixta1 = new PorcionMixta(Arrays.asList(porcionSoja1, porcionSoja2, porcionTrigo1, porcionTrigo2));
		porcionMixta1.gananciaAnual();
		assertEquals(1600,porcionMixta1.gananciaAnual());
	}
	
	@Test
	public void testGananciaAnualMixtaCon2Trigo1Soja1Mixta() {
		Porcion soj1 = new PorcionSoja();
		Porcion soj2 = new PorcionSoja();
		Porcion trig1 = new PorcionTrigo();
		Porcion trig2 = new PorcionTrigo();
		Porcion porcionMixta1 = new PorcionMixta(Arrays.asList(soj1, soj2, trig1, trig2));/*400*/
		Porcion porcionMixta2 = new PorcionMixta(Arrays.asList(porcionSoja2, porcionTrigo1, porcionSoja1, porcionMixta1)); /*1100*/
		assertEquals(400,porcionMixta1.gananciaAnual());
		assertEquals(1700,porcionMixta2.gananciaAnual());
	}
}
