package banco.intgraph;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ShowA2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ShowA2() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código:");
		lblNewLabel.setBounds(12, 25, 64, 15);
		add(lblNewLabel);
		
		JLabel label = new JLabel("...");
		label.setForeground(UIManager.getColor("Label.foreground"));
		label.setBounds(94, 25, 70, 15);
		add(label);
		
		JLabel lblDescrio = new JLabel("Descrição:");
		lblDescrio.setBounds(12, 68, 89, 15);
		add(lblDescrio);
		
		JTextPane txtpnTextoGrandeAqui = new JTextPane();
		txtpnTextoGrandeAqui.setForeground(UIManager.getColor("Label.foreground"));
		txtpnTextoGrandeAqui.setEditable(false);
		txtpnTextoGrandeAqui.setBackground(UIManager.getColor("Panel.background"));
		txtpnTextoGrandeAqui.setText("...");
		txtpnTextoGrandeAqui.setBounds(94, 68, 149, 75);
		add(txtpnTextoGrandeAqui);
		
		JLabel lblNumeroDeContas = new JLabel("Nº de Contas:");
		lblNumeroDeContas.setBounds(12, 155, 104, 15);
		add(lblNumeroDeContas);
		
		JLabel label_1 = new JLabel("...");
		label_1.setForeground(UIManager.getColor("Label.foreground"));
		label_1.setBounds(122, 155, 70, 15);
		add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(356, 12, 315, 538);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Id", "Descri\u00E7\u00E3o", "Contas"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		textField = new JTextField();
		textField.setBounds(356, 559, 114, 25);
		add(textField);
		textField.setColumns(10);
		
		JButton btnEscolherAgncia = new JButton("Escolher Agência");
		btnEscolherAgncia.setBounds(491, 559, 180, 25);
		add(btnEscolherAgncia);
		table.getColumnModel().getColumn(0).setPreferredWidth(56);
		table.getColumnModel().getColumn(1).setPreferredWidth(241);
		table.getColumnModel().getColumn(2).setResizable(false);

	}
}
