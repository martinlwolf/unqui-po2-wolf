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

	public abstract void actualizarAprobacion();

	public EstadoDeAprobacion getEstadoDeAprobacion() {
		return estadoDeAprobacion;
	}

	public void setEstadoDeAprobacion(EstadoDeAprobacion estadoDeAprobacion) {
		this.estadoDeAprobacion = estadoDeAprobacion;
	}
	
	
}
