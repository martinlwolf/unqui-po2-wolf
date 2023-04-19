package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private LocalDate fechaDeNacimiento;
	private String nombre;
	
	public Persona(LocalDate fechaDeNacimiento, String nombre) {
		super();
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nombre = nombre;
	}
	
	
	public int edad() {
		return (Period.between(this.fechaDeNacimiento, LocalDate.now()).getYears());
	}
	
}
