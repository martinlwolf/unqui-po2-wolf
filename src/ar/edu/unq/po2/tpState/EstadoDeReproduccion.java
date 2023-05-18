package ar.edu.unq.po2.tpState;

public abstract class EstadoDeReproduccion {
	protected Reproductor reproductor;
	
	public abstract boolean esPlay();
	public abstract boolean esPausa();
	public abstract boolean esStop();
	
	public abstract String play();
	public abstract String pausa();
	public abstract String stop();
}
