package ar.edu.unq.po2.tp3;

public class Norte extends Direccion {

	@Override
	protected void moverElPunto_EstasUnidades_(Point punto, int unidades) {
		
		punto.setY(punto.getY() + (unidades));

	}

}
