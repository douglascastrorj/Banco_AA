package agencia;

import java.util.HashMap;
import conta.Conta;

public class Agencia {

	private static int cont = 0;
	private int codigo;
	private HashMap<Integer, Conta> contas = new HashMap<Integer, Conta>();

	public Agencia() {

		cont++;
		this.setCodigo(cont);

	}
	
//	Gets AND Sets

	public static int getCont() {
		return cont;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public HashMap<Integer, Conta> getContas() {
		return contas;
	}

	public void setContas(HashMap<Integer, Conta> contas) {
		this.contas = contas;
	}

	
	
}
