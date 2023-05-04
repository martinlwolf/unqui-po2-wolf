package ar.edu.unq.po2.tp3;

public class Punto {
	float x;
	float y;
	public boolean tieneLaja;
	
	public Punto(float x, float y) {
		super();
		this.setXY(x, y);
		this.tieneLaja = false;
	}
	
	public static Punto puntoEnOrigen() {
		Punto puntoNuevo = new Punto(0,0);
		return puntoNuevo;
	}
	
	public void moverPuntoEstasUnidades_EnDireccion_(int unidades, Direccion direccion) {
		direccion.moverElPunto_EstasUnidades_(this, unidades);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Punto)) {
			return false;
	}
	Punto otroPunto = (Punto) obj;
	return this.x == otroPunto.getX() && this.y == otroPunto.getY(); 
	}
	
	/**
	 * 
	 * Getters y setters
	 */
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}

	public void sumarseCon_(Punto punto2) {
		float coorX = this.getX() + punto2.getX();
		float coorY = this.getY() + punto2.getY();
		this.setXY(coorX, coorY);
	}
	
}
