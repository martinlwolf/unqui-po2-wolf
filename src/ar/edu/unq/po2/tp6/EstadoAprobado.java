package ar.edu.unq.po2.tp6;

public class EstadoAprobado extends EstadoDeAprobacion {

	@Override
	public boolean esRechazado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esAprobado() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esPendiente() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
