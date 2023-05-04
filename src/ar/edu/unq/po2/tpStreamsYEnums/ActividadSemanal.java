package ar.edu.unq.po2.tpStreamsYEnums;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private int horaDeInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int horaDeInicio, int duracion, Deporte deporte) {
		super();
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public Double costeFinal() {
		return this.deporte.getComplejidad() * 200 + this.costeBaseSegunDiaYHora();
	}

	private double costeBaseSegunDiaYHora() {
		if((this.dia == DiaDeLaSemana.Lunes) || (this.dia == DiaDeLaSemana.Martes) || (this.dia == DiaDeLaSemana.Miercoles)) {
			return duracion * 500;
		}
		else {
			return duracion * 1000;
		}
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public void setHoraDeInicio(int horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}

	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}

	public int complejidad() {
		// TODO Auto-generated method stub
		return this.getDeporte().getComplejidad();
	}
	
	public static void main(String[] args) {
		ActividadSemanal act = new ActividadSemanal(DiaDeLaSemana.Martes, 19, 1, Deporte.FUTBOL);
		System.out.println(act);
	}
	
	public String toString() {
		return "Deporte:" + this.deporte.toString() + "Dia:" + this.dia.toString() + "a las" + this.horaDeInicio + "Duracion:" + this.duracion;
	}
	
	
	

}
