package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	
	protected Cliente clienteSolicitante;
	protected double montoSolicitado;
	protected int plazoDePagoEnMeses;
	protected EstadoDeAprobacion estadoDeAprobacion;
	public SolicitudDeCredito(Cliente clienteSolicitante, double montoSolicitado, int plazoDePagoEnMeses) {
		super();
		this.clienteSolicitante = clienteSolicitante;
		this.montoSolicitado = montoSolicitado;
		this.plazoDePagoEnMeses = plazoDePagoEnMeses;
		this.estadoDeAprobacion = new PendienteDeAprobacion();
	}
	
	public double montoCuotaMensual() {
		return this.montoSolicitado / this.plazoDePagoEnMeses;
	}

	public void actualizarAprobacion() {
		if(this.elClienteCumpleLosRequisitos()) {
			this.estadoDeAprobacion = new EstadoAprobado();
		}
		else this.estadoDeAprobacion = new EstadoRechazado();
		
	}
	
	public abstract boolean elClienteCumpleLosRequisitos();

	public EstadoDeAprobacion getEstadoDeAprobacion() {
		return estadoDeAprobacion;
	}

	public void setEstadoDeAprobacion(EstadoDeAprobacion estadoDeAprobacion) {
		this.estadoDeAprobacion = estadoDeAprobacion;
	}

	public Cliente getClienteSolicitante() {
		return clienteSolicitante;
	}

	public void setClienteSolicitante(Cliente clienteSolicitante) {
		this.clienteSolicitante = clienteSolicitante;
	}
	
	
	
	
}
