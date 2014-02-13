package conta;

import data.Data;

public class ContaPoupanca extends ContaBancaria {
	
	private Data dataAniversario;
	private double taxaRendimento;
	
	public ContaPoupanca() {
		// TODO Auto-generated constructor stub
		
		this.setTaxaRendimento(0.1);
	}
	
//	Override do metodo de ContaBancaria
	@Override
	public void aplicarRendimentos() {
		// TODO Auto-generated method stub
		super.setSaldo(super.getSaldo() * (1 + this.getTaxaRendimento()));
		
	}
	
	public Data getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(Data dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
		
	

}
