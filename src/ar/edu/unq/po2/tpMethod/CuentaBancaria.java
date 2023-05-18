package ar.edu.unq.po2.tpMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public abstract class CuentaBancaria {
	private String titular;
	 private int saldo;
	 private List<String> movimientos;
	 public CuentaBancaria(String titular){
	 this.titular=titular;
	 this.saldo=0;
	 this.movimientos=new ArrayList<String>();
	 }
	 public String getTitular(){
	 return this.titular;
	 }
	 public int getSaldo(){
	 return this.saldo;
	 }
	 protected void setSaldo(int monto){
	 this.saldo=monto;
	 }
	 public void agregarMovimientos(String movimiento){
	 this.movimientos.add(movimiento);
	 }
	 public void extraer(int monto) {
		 if(this.condicionDeRetiroPara(monto)){
		 this.setSaldo(this.getSaldo()-monto);
		 this.agregarMovimientos("Extraccion");
		 }
	 }
	 
	 public abstract boolean condicionDeRetiroPara(int monto);
}

