package agencia.intgraph.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PainelNovoClienteActionListeners {

	public static ActionListener botaoOkGetAction(){
		return (new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public static ActionListener botaoCancelarGetAction(){
		return (new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
