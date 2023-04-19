package ar.edu.unq.po2.tp6;

import java.util.function.BooleanSupplier;

public abstract class EstadoDeAprobacion {

	public abstract boolean esRechazado(); 
	
	public abstract boolean esAprobado();
	
	public abstract boolean esPendiente();

}
