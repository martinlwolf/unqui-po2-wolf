package ar.edu.unq.po2.tpComposite.ejWarcraft;

import ar.edu.unq.po2.tp3.Punto;

public class Caballero extends Soldado {
	
	public Caballero(Punto punto) {
		super();
		this.ubicacion = punto;
	}

	@Override
	protected void moverA(Punto otroPunto) {
		while(!(this.ubicacion.equals(otroPunto))) {
			this.moverseUnaUbicacionMasCercaDe(otroPunto);
		}
	}

}
