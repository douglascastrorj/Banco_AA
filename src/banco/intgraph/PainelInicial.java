package banco.intgraph;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Inicio.Teste;



public class PainelInicial {
	
//	Logo
	final ImageIcon logo1 = new ImageIcon("src/imgs/logo.jpg");	
	final JLabel logo = new JLabel(logo1);
	
	private final JPanel painelLogo = new JPanel();
	
//	Botao
	
	final JButton botaoEntrar = new JButton("Entrar");
	private final JPanel painelBotao = new JPanel();
	
	private final JPanel painelCompleto = new JPanel();
	
	
//	Construtor
	public PainelInicial() {		
		
		
		painelLogo.add(logo);
		painelBotao.add(botaoEntrar);
		
//		botaoEntrar.addActionListener(new Event1());
		
		botaoEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				Teste.getBancoGNB().aAA();
//				Teste.getBancoGNB().getAgencias().get(1).aAA();
				
//				Limpa janela e adiciona outra tela 
				Teste.janela.getContentPane().removeAll();
				Teste.janela.getContentPane().add(Teste.getBancoGNB().getPainelTabbed().getPainelCompleto());
				Teste.janela.pack();
				Teste.janela.getContentPane().revalidate();

			}
		});
		
		painelCompleto.setLayout(new BorderLayout());
		painelCompleto.add(painelLogo, BorderLayout.CENTER);
		painelCompleto.add(painelBotao, BorderLayout.SOUTH);
		
		
	}


	public JPanel getPainelCompleto() {
		return painelCompleto;
	}

	

}
