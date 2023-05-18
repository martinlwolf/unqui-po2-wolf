package ar.edu.unq.po2.tpState;

public class EstadoSinFichas extends EstadoFichas {

	public EstadoSinFichas(Maquina maquina) {
		this.maquina = maquina;
	}

	@Override
	public String presionarBoton() {
		return "insert coin";
	}

	@Override
	protected boolean esSinFichas() {
		return true;
	}

	@Override
	protected boolean esCon1Ficha() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean esCon2Fichas() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void ingresarFicha() {
		this.maquina.setEstadoFichasActual(new Estado1Jugador(this.maquina));
	}

}
