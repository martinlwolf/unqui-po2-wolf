package ar.edu.unq.po2.tpState;

public class EstadoPausa extends EstadoDeReproduccion {

	public EstadoPausa(Reproductor reproductor) {
		this.reproductor = reproductor;
	}

	@Override
	public boolean esPlay() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esPausa() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esStop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String play() {
		this.reproductor.setEstado(new EstadoPlay(this.reproductor));
		return "reproduciendo";
	}

	@Override
	public String pausa() {
		
		return "ya esta pausado";
	}

	@Override
	public String stop() {
		this.reproductor.setEstado(new EstadoStop(this.reproductor));
		return "parado";
	}

}
