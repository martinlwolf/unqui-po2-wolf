package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	/**
	 * Variables
	 */
	Punto esquinaInferiorIzquierda;
	int altura;
	int ancho;
	

	public Rectangulo(Punto esquinaInferiorIzquierda, int altura, int ancho) {
		super();
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
		this.altura = altura;
		this.ancho = ancho;
	}
	

	public Punto esquinaSuperiorIzquierda() {
		float x = this.esquinaInferiorIzquierda.getX(); 
		float y =	this.esquinaInferiorIzquierda.getY();
		y = y + this.altura;
		Punto punto = new Punto(x, y);
		return punto;
	}
	
	public Punto esquinaSuperiorDerecha() {
		float x = this.esquinaInferiorIzquierda.getX(); 
		float y =	this.esquinaInferiorIzquierda.getY();
		y = y + this.altura;
		x = x + this.ancho;
		Punto punto = new Punto(x, y);
		return punto;
	}
	
	public Punto esquinaInferiorDerecha() {
		float x = this.esquinaInferiorIzquierda.getX(); 
		float y =	this.esquinaInferiorIzquierda.getY();
		x = x + this.ancho;
		Punto punto = new Punto(x, y);
		return punto;
	}


	public void moverRectanguloAPunto(Punto nuevoPunto) {
		this.esquinaInferiorIzquierda.setXY(nuevoPunto.getX(), nuevoPunto.getY());
		
	}


	public Integer area() {
		return (this.ancho * this.altura);
	}
	

}
