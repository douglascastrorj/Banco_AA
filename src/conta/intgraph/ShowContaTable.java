package conta.intgraph;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ShowContaTable {
	


	// Tabela
	final JTable tabelaContas = new JTable(2, 2);
	private final JPanel painelTabelaContas = new JPanel();

	// Formulario em SOUTH
	final JTextField textField = new JTextField(20);
	final JButton botaoEscolherCliente = new JButton("Escolher Conta");
	private final JPanel painelFormularioEscolherTabela = new JPanel();

	private final JPanel painelCompleto = new JPanel();

	public ShowContaTable() {

		// Adicionando elementos no painel da Tabela
		tabelaContas.setRowHeight(20);

		painelTabelaContas.add(tabelaContas);

		// Adicionando elementos no Formulario de escolha da Agencia
		painelFormularioEscolherTabela.add(textField);
		painelFormularioEscolherTabela.add(botaoEscolherCliente);

		// Layout do PAINEL
		painelCompleto.setLayout(new BorderLayout());
		painelCompleto.add(painelTabelaContas, BorderLayout.NORTH);
		painelCompleto.add(painelFormularioEscolherTabela, BorderLayout.SOUTH);

	}

	// Gets 'n' Sets
	public JPanel getPainelCompleto() {
		return painelCompleto;
	}

}
