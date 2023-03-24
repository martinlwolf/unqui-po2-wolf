package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	protected EmpleadoTemporario(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			int sueldoBasico, LocalDate fechaFinDesignacionPlanta, int cantidadHorasExtras) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}

	private LocalDate fechaFinDesignacionPlanta;
	private int cantidadHorasExtras;
	
	
	@Override
	protected int sueldoBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int retenciones() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int sueldoNeto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
