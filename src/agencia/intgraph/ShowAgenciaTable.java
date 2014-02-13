package agencia.intgraph;


import javax.swing.*;

public class ShowAgenciaTable {
	
//	Tabela
	final JTable tabelaAgencias = new JTable(2, 2);	
	private final JPanel painelTabelaAgencias = new JPanel();
	
//	Formulario em SOUTH
	final JTextField textField = new JTextField(20);
	final JButton botaoEscolherAgencia = new JButton("Escolher Agencia");
	private final JPanel painelFormularioEscolherTabela = new JPanel();
	
	public ShowAgenciaTable() {

//		Adicionando elementos no painel da Tabela
		tabelaAgencias.setRowHeight(20);
		
		
		painelTabelaAgencias.add(tabelaAgencias);
		
//		Adicionando elementos no Formulario de escolha da Agencia
		painelFormularioEscolherTabela.add(textField);
		painelFormularioEscolherTabela.add(botaoEscolherAgencia);
		
	}

	
//	Gets 'n' Sets
	public JPanel getPainelTabelaAgencias() {
		return painelTabelaAgencias;
	}


	public JPanel getPainelFormularioEscolherTabela() {
		return painelFormularioEscolherTabela;
	}
	
	
	

}
