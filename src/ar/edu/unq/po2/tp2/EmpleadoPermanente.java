package ar.edu.unq.po2.tp2;

public class EmpleadoPermanente extends Empleado {

	protected EmpleadoPermanente(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			int sueldoBasico, int cantidadDeHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		// TODO Auto-generated constructor stub
	}
	
	private int cantidadDeHijos;
	private int antiguedad;

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
