package ar.edu.unq.po2.tpStreamsYEnums;

public enum ColoresLesionesDermatologicas {
	Rojo {
		public String descripcion() {
			return "DescRojo";
		}
		
		public int riesgo() {
			return 4;
		}

		@Override
		public ColoresLesionesDermatologicas siguienteColor() {
			// TODO Auto-generated method stub
			return ColoresLesionesDermatologicas.Gris;
		}
	}, 
	Gris {
		public String descripcion() {
			return "DescGris";
		}
		
		public int riesgo() {
			return 3;
		}

		@Override
		public ColoresLesionesDermatologicas siguienteColor() {
			// TODO Auto-generated method stub
			return ColoresLesionesDermatologicas.Amarillo;
		}
	}, 
	Amarillo {
		public String descripcion() {
			return "DescAmarillo";
		}
		
		public int riesgo() {
			return 2;
		}

		@Override
		public ColoresLesionesDermatologicas siguienteColor() {
			// TODO Auto-generated method stub
			return ColoresLesionesDermatologicas.Miel;
		}
	}, 
	Miel {
		public String descripcion() {
			return "DescMiel";
		}
		
		public int riesgo() {
			return 1;
		}

		@Override
		public ColoresLesionesDermatologicas siguienteColor() {
			// TODO Auto-generated method stub
			return ColoresLesionesDermatologicas.Rojo;
		}
	};
	
	public abstract String descripcion();
	public abstract int riesgo();
	public abstract ColoresLesionesDermatologicas siguienteColor();
}
