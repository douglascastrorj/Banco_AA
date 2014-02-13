import java.awt.BorderLayout;

import javax.swing.*;

import agencia.intgraph.ShowAgenciaTable;
import banco.intgraph.PainelInicial;

public class Init {
	
	private void janelaBanco(JFrame janela) {
		// TODO Auto-generated method stub

		PainelInicial painelBancoInicial = new PainelInicial();

		janela.getContentPane().add(painelBancoInicial.getPainelLogo(),
				BorderLayout.NORTH);
		janela.getContentPane().add(painelBancoInicial.getPainelBotao(),
				BorderLayout.SOUTH);

	}
	
	private void janelaTabelaAgencias(JFrame janela) {
		// TODO Auto-generated method stub

		ShowAgenciaTable painelTabelaAgencias = new ShowAgenciaTable();
		
		janela.getContentPane().add(painelTabelaAgencias.getPainelTabelaAgencias());
		janela.getContentPane().add(painelTabelaAgencias.getPainelFormularioEscolherTabela(), BorderLayout.SOUTH);

	}
	
	

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Init gnb = new Init();
		
		JFrame janela = new JFrame(NOME_JANELA);
		janela.setSize(JANELA_WIDTH, JANELA_HEIGHT);
		
		
		
		
		gnb.janelaBanco(janela);
//		gnb.janelaTabelaAgencias(janela);
		
		
		
		
		

		// janela.pack();
		// janela.show();
		janela.setVisible(true);

	}

	
	
	
//	Variaveis
	private final static String NOME_JANELA = "GNB";

	private final static int JANELA_WIDTH = 600;
	private final static int JANELA_HEIGHT = 600;

}
