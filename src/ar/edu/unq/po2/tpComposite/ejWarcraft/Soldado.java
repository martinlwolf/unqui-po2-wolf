package ar.edu.unq.po2.tpComposite.ejWarcraft;
import ar.edu.unq.po2.tp3.Punto;

public abstract class Soldado {
	protected Punto ubicacion;
	protected Tablero tableroActual;
	
	public Punto ubicacionActual() {
		return this.ubicacion;
	}
	
	public void moverseUnaUbicacionMasCercaDe(Punto unPunto) {
		if((this.ubicacion.getX() != unPunto.getX()) & (this.ubicacion.getY() != unPunto.getY())) {
			this.ubicacion.setX(this.ubicacion.getX() + 1);
			this.ubicacion.setY(this.ubicacion.getY() + 1);
		}
		else {
			if((this.ubicacion.getX() == unPunto.getX()) & (this.ubicacion.getY() != unPunto.getY())) {
				this.ubicacion.setY(this.ubicacion.getY() + 1);
			}
			else {
				if((this.ubicacion.getX() != unPunto.getX()) & (this.ubicacion.getY() == unPunto.getY())) {
					this.ubicacion.setX(this.ubicacion.getX() + 1);
				}
			}
		}
	}

	protected abstract void moverA(Punto ubicacionActual);
}
