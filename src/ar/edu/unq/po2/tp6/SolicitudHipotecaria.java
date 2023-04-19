package ar.edu.unq.po2.tp6;

public class SolicitudHipotecaria extends SolicitudDeCredito {
	
	private Propiedad propiedadEnGarantia;

	public SolicitudHipotecaria(Cliente clienteSolicitante, double montoSolicitado, int plazoDePagoEnMeses, Propiedad propiedadEnGarantia) {
		super(clienteSolicitante, montoSolicitado, plazoDePagoEnMeses);
		this.propiedadEnGarantia = propiedadEnGarantia;
	}
	
	@Override
	public void actualizarAprobacion() {
		if(this.elClienteCumpleLosRequisitos()) {
			this.estadoDeAprobacion = new EstadoAprobado();
		}
		else this.estadoDeAprobacion = new EstadoRechazado();
		
	}

	private boolean elClienteCumpleLosRequisitos() {
		return ((this.montoSolicitado < this.propiedadEnGarantia.getValorFiscal() * 0.70) & (this.montoCuotaMensual() < this.clienteSolicitante.getSueldoNetoMensual() * 0.50) & (this.elClienteCumpleElRequisitoDeEdad()));
	}

	private boolean elClienteCumpleElRequisitoDeEdad() {
		return this.clienteSolicitante.getEdad() + this.plazoDePagoEnMeses / 12 < 65;
	}

}
