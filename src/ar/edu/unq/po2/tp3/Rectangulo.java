package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	/**
	 * Variables
	 */
	Point esquinaInferiorIzquierda;
	int altura;
	int ancho;
	

	public Rectangulo(Point esquinaInferiorIzquierda, int altura, int ancho) {
		super();
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
		this.altura = altura;
		this.ancho = ancho;
	}
	

	public Point esquinaSuperiorIzquierda() {
		float x = this.esquinaInferiorIzquierda.getX(); 
		float y =	this.esquinaInferiorIzquierda.getY();
		y = y + this.altura;
		Point punto = new Point(x, y);
		return punto;
	}
	
	public Point esquinaSuperiorDerecha() {
		float x = this.esquinaInferiorIzquierda.getX(); 
		float y =	this.esquinaInferiorIzquierda.getY();
		y = y + this.altura;
		x = x + this.ancho;
		Point punto = new Point(x, y);
		return punto;
	}
	
	public Point esquinaInferiorDerecha() {
		float x = this.esquinaInferiorIzquierda.getX(); 
		float y =	this.esquinaInferiorIzquierda.getY();
		x = x + this.ancho;
		Point punto = new Point(x, y);
		return punto;
	}


	public void moverRectanguloAPunto(Point nuevoPunto) {
		this.esquinaInferiorIzquierda.setXY(nuevoPunto.getX(), nuevoPunto.getY());
		
	}


	public Integer area() {
		return (this.ancho * this.altura);
	}
	

}
