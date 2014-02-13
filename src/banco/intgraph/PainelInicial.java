package banco.intgraph;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelInicial {
	
//	Logo
	final ImageIcon logo1 = new ImageIcon("src/imgs/logo.png");	
	final JLabel logo = new JLabel(logo1);
	
	private final JPanel painelLogo = new JPanel();
	
//	Botao
	
	final JButton botaoEntrar = new JButton("Entrar");
	private final JPanel painelBotao = new JPanel();
	
	
	public PainelInicial() {		
		
		painelLogo.add(logo);
		painelBotao.add(botaoEntrar);
		
		
	}


	public JPanel getPainelLogo() {
		return painelLogo;
	}


	public JPanel getPainelBotao() {
		return painelBotao;
	}
	
	
	
	
	

}
