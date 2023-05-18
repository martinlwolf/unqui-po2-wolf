package ar.edu.unq.po2.tpState;

public abstract class EstadoFichas {
	
	protected Maquina maquina;

	public abstract String presionarBoton() ;

	protected abstract boolean esSinFichas();

	protected abstract boolean esCon1Ficha();

	protected abstract boolean esCon2Fichas();

	protected abstract void ingresarFicha();


}
