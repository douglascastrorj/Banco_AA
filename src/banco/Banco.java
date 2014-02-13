package banco;

import java.util.HashMap;

import agencia.Agencia;

public class Banco {
	
	private String nome;
	private HashMap<Integer, Agencia> agencias = new HashMap<Integer, Agencia>();
	
	
	public Banco(String nome) {
		
		setNome(nome);
		
		Agencia agencia = new Agencia();
		getAgencias().put(agencia.getCodigo(), agencia);
		
	}


	public HashMap<Integer, Agencia> getAgencias() {
		return agencias;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addAgencia(){
		Agencia agencia = new Agencia();
		getAgencias().put(agencia.getCodigo(), agencia);
	}
	
	

}
