package conta;

public class ContaCartaoCredito extends Conta{
	
	
	public void pagar(){
		super.setSaldo(0);
	}
	
	public void cobrarJuros(){
		super.setSaldo(super.getSaldo() * 1.05);
	}

}
