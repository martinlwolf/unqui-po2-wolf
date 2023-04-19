package ar.edu.unq.po2.tp6;

public class SolicitudPersonal extends SolicitudDeCredito {

	public SolicitudPersonal(Cliente clienteSolicitante, double montoSolicitado, int plazoDePagoEnMeses) {
		super(clienteSolicitante, montoSolicitado, plazoDePagoEnMeses);
	}

	@Override
	public void actualizarAprobacion() {
		if(this.elClienteCumpleLosRequisitos()) {
			this.estadoDeAprobacion = new EstadoAprobado();
		}
		else this.estadoDeAprobacion = new EstadoRechazado();
		
	}

	private boolean elClienteCumpleLosRequisitos() {
		return ((this.clienteSolicitante.sueldoNetoAnual() > 15000) & (this.montoCuotaMensual() < this.clienteSolicitante.getSueldoNetoMensual() * 0.70));
	}
	
	
	

}
