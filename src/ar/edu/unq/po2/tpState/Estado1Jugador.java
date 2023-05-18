package ar.edu.unq.po2.tpState;

public class Estado1Jugador extends EstadoFichas {
	
	

	public Estado1Jugador(Maquina maquina) {
		super();
		this.maquina = maquina;
	}

	@Override
	public String presionarBoton() {
		return "comienza juego 1 jugador";
	}

	@Override
	protected boolean esSinFichas() {
		return false;
	}

	@Override
	protected boolean esCon1Ficha() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected boolean esCon2Fichas() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void ingresarFicha() {
		this.maquina.setEstadoFichasActual(new Estado2Jugadores(this.maquina));
	}

}
