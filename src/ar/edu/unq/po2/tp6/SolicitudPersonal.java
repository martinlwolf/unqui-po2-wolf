package ar.edu.unq.po2.tp6;

public class SolicitudPersonal extends SolicitudDeCredito {

	public SolicitudPersonal(Cliente clienteSolicitante, double montoSolicitado, int plazoDePagoEnMeses) {
		super(clienteSolicitante, montoSolicitado, plazoDePagoEnMeses);
	}

	@Override
	public boolean elClienteCumpleLosRequisitos() {
		return ((this.clienteSolicitante.sueldoNetoAnual() > 15000) & (this.montoCuotaMensual() < this.clienteSolicitante.getSueldoNetoMensual() * 0.70));
	}
	
	
	

}
