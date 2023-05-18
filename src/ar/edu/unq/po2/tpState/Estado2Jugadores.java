package ar.edu.unq.po2.tpState;

public class Estado2Jugadores extends EstadoFichas {
	
	

	public Estado2Jugadores(Maquina maquina) {
		super();
		this.maquina = maquina;
	}

	@Override
	public String presionarBoton() {
		return "comienza juego 2 jugadores";
	}

	@Override
	protected boolean esSinFichas() {
		return false;
	}

	@Override
	protected boolean esCon1Ficha() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean esCon2Fichas() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void ingresarFicha() {
		// TODO Auto-generated method stub
		
	}

}
