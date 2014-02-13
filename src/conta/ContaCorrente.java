package conta;

public class ContaCorrente extends ContaBancaria {

	private double taxaJuros;
	private double limiteSaque;
	private double taxaServico;

	
	public ContaCorrente() {
		// TODO Auto-generated constructor stub
		
		this.setTaxaJuros(7.0);
		this.setLimiteSaque(200.00);
		this.setTaxaServico(50.00);
		
	}
	
	
	// Override da classe abstract ContaBancaria
	@Override
	public void aplicarRendimentos() {
		// TODO Auto-generated method stub

	}
	
//	Override da classe Conta
	@Override
	public boolean sacar(double valorSaque) {
		// TODO Auto-generated method stub
		
		if (valorSaque > this.getLimiteSaque()) {
			return false;
		}
		else {
			super.setSaldo(super.getSaldo() - valorSaque);
		}
		
		return true;
	}
	
	

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getTaxaServico() {
		return taxaServico;
	}

	public void setTaxaServico(double taxaServico) {
		this.taxaServico = taxaServico;
	}

}
