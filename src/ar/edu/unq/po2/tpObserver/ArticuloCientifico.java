package ar.edu.unq.po2.tpObserver;

public class ArticuloCientifico {
	private String titulo;
	private String autor;
	private String filiacion;
	private String tipo;
	
	public String getCampo(String campo) {
		if(campo.equals("titulo")) {
			return titulo;
		}
		else if(campo.equals("autor")) {
			return autor;
		}
		else if(campo.equals("filiacion")) {
			return filiacion;
		}
		else {
			return tipo;
		}
		
	}
	
	
}
