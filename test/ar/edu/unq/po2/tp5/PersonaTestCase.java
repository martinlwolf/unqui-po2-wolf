package ar.edu.unq.po2.tp5;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PersonaTestCase {
	
	private Persona persona1;
	private Persona persona2;
	
	public void setUp() {
		persona1 = new Persona(LocalDate.of(2000, 3, 10), "a");
		persona2 = new Persona(LocalDate.of(2001, 3, 10), "b");
	}
	
	
	public void testCompararEdades() {
		assertTrue(persona1.edad() > persona2.edad());
	}
}
