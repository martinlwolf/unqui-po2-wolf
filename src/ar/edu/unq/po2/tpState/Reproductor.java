package ar.edu.unq.po2.tpState;

public class Reproductor {
	
	private EstadoDeReproduccion estado;

	public Reproductor() {
		super();
		this.estado = new EstadoStop(this);
	}
	
	public String play() {
		return this.estado.play();
	}
	
	public String pause() {
		return this.estado.pause();
	}
	
	public String stop() {
		return this.estado.stop();
	}

	public EstadoDeReproduccion getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeReproduccion estado) {
		this.estado = estado;
	}
	
	

}
