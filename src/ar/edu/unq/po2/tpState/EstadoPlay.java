package ar.edu.unq.po2.tpState;

public class EstadoPlay extends EstadoDeReproduccion {

	public EstadoPlay(Reproductor reproductor) {
		this.reproductor = reproductor;
	}

	@Override
	public boolean esPlay() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean esPausa() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esStop() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "yaSeEstaReproduciendo";
	}

	@Override
	public String pausa() {
		this.reproductor.setEstado(new EstadoPausa(this.reproductor));
		return "pausado";
	}

	@Override
	public String stop() {
		this.reproductor.setEstado(new EstadoStop(this.reproductor));
		return "parado";
	}

}
