package ar.edu.unq.po2.tpMethod;

public class CajaDeAhorro extends CuentaBancaria {
	private int limite;
	 public CajaDeAhorro(String titular, int limite){
	 super(titular);
	 this.limite=limite;
	 }
	 public int getLimite(){
	 return this.limite;
	 }
	public boolean condicionDeRetiroPara(int monto) {
		return this.getSaldo() >= monto && this.getLimite()>=monto;
	}
	 
}
