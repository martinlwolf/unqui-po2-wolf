package ar.edu.unq.po2.tpObserver;

public interface SistemaObserver {

	boolean cumpleCondicionParaNotificar(Encuentro encuentro);

	public void update(Encuentro encuentro);

}
