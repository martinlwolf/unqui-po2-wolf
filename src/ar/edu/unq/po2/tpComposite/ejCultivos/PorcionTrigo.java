package ar.edu.unq.po2.tpComposite.ejCultivos;

public class PorcionTrigo extends Porcion {
	
	public PorcionTrigo() {
		this.subDivisionesHechas = 0;
	}

	@Override
	public double gananciaAnual() {
		if(this.subDivisionesHechas == 0) {
			return this.gananciaBase();
		}
		else {
			return this.gananciaBase() / (Math.pow(4,this.subDivisionesHechas));
		}
	}
	
	public double gananciaBase() {
		return 1200;
	}
	


}
