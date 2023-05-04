package ar.edu.unq.po2.tpComposite.ejWarcraft;

import java.util.function.BooleanSupplier;

import ar.edu.unq.po2.tp3.Punto;

public class Ingeniero extends Soldado {
	private int cantidadDeLajas;
	
	public Ingeniero(Punto punto, int cantidadLajas, Tablero tablero) {
		super();
		this.ubicacion = punto;
		this.cantidadDeLajas = cantidadLajas;
		this.tableroActual = tablero;
		this.ponerLajaSiNoHay();
	}

	private void ponerLajaSiNoHay() {
		if(!(this.hayLajaDondeEsta()) && this.quedanLajas()) {
			this.ubicacionActualEnTablero().tieneLaja = true;
			this.cantidadDeLajas = this.cantidadDeLajas - 1;
		}
		
	}
	
	public void agregarLajasALaBolsa(int cantLajas) {
		this.cantidadDeLajas = this.cantidadDeLajas + cantLajas;
	}

	public boolean quedanLajas() {
		return this.cantidadDeLajas >= 1;
	}

	@Override
	protected void moverA(Punto otroPunto) {
		while(!(this.ubicacion.equals(otroPunto))) {
			this.moverseUnaUbicacionMasCercaDe(otroPunto);
			this.ponerLajaSiNoHay();
		}
	}

	public boolean hayLajaDondeEsta() {
		
		return this.ubicacionActualEnTablero().tieneLaja;
	}
	
	public Punto ubicacionActualEnTablero() {
		return this.tableroActual.getListaDeCoordenadas().stream().filter(punto -> punto.equals(this.ubicacion)).findFirst().get();
	}

}
