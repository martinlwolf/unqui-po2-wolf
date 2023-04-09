package ar.edu.unq.po2.tp3;

public class Point {
	float x;
	float y;
	
	public Point(float x, float y) {
		super();
		this.setXY(x, y);
	}
	
	public static Point puntoEnOrigen() {
		Point puntoNuevo = new Point(0,0);
		return puntoNuevo;
	}
	
	public void moverPuntoEstasUnidades_EnDireccion_(int unidades, Direccion direccion) {
		direccion.moverElPunto_EstasUnidades_(this, unidades);
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

	public void sumarseCon_(Point punto2) {
		float coorX = this.getX() + punto2.getX();
		float coorY = this.getY() + punto2.getY();
		this.setXY(coorX, coorY);
	}
	
}
