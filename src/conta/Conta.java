package conta;

import data.Data;

public abstract class Conta {
	
	private int numero;
	private double saldo;
	private Data dataAbertura;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	
//	Metodos de Conta
	public boolean sacar(double valorSaque){
		
		if (valorSaque > this.getSaldo()) {
			return false;
		}
		else {
			this.setSaldo(this.getSaldo() - valorSaque);
		}
		
		return true;
	}
	
//	Metodo usado para ver o SALDO da conta
	public double obterSaldo(){
		return this.saldo;
	}
	
	
//	Gets AND Sets
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
}
