package ar.edu.unq.po2.tpState;

public class EstadoStop extends EstadoDeReproduccion {

	public EstadoStop(Reproductor reproductor) {
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
		return false;
	}

	@Override
	public boolean esStop() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String play() {
		this.reproductor.setEstado(new EstadoPlay(this.reproductor));
		return "reproduciendo";
	}

	@Override
	public String pausa() {
		this.reproductor.setEstado(new EstadoPausa(this.reproductor));
		return "pausado";
	}

	@Override
	public String stop() {
		return "ya esta parado";
	}
	
}
