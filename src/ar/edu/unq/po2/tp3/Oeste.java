package ar.edu.unq.po2.tp3;

public class Oeste extends Direccion {

	@Override
	protected void moverElPunto_EstasUnidades_(Point punto, int unidades) {
		punto.setX(punto.getX() + (unidades * -1));

	}

}
