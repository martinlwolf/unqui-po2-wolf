package ar.edu.unq.po2.tp3;

public class Este extends Direccion {

	@Override
	protected void moverElPunto_EstasUnidades_(Point punto, int unidades) {
		punto.setX(punto.getX() + (unidades));

	}

}
