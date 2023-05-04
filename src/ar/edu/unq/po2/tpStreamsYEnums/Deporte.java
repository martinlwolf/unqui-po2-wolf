package ar.edu.unq.po2.tpStreamsYEnums;

public enum Deporte {
	RUNNING(1), FUTBOL(2), BASKET(2), TENNIS(3), JABALINA(4);

	private int complejidad;

	Deporte(int i) {
		this.complejidad = i;
	}

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
	
	
}
