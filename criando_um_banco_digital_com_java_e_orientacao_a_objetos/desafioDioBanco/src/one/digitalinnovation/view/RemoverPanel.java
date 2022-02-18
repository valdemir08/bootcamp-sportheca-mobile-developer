package one.digitalinnovation.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import one.digitalinnovation.model.SpringUtilities;

public class RemoverPanel extends JPanel{
	
	private JLabel agenciaLabel, contaLabel;
	private JTextField agenciaField, contaField;
	
	public RemoverPanel() {
		setLayout(new SpringLayout());
		
		agenciaLabel = new JLabel("Agencia");
		agenciaField = new JTextField(10);
		
		contaLabel = new JLabel("Conta");
		contaField = new JTextField(10);
		
		add(agenciaLabel);
		add(agenciaField);
		add(contaLabel);
		add(contaField);
		
		SpringUtilities.makeCompactGrid(this, 2, 2, 30, 20, 50, 20);
	}

	public JLabel getAgenciaLabel() {
		return agenciaLabel;
	}

	public void setAgenciaLabel(JLabel agenciaLabel) {
		this.agenciaLabel = agenciaLabel;
	}

	public JLabel getContaLabel() {
		return contaLabel;
	}

	public void setContaLabel(JLabel contaLabel) {
		this.contaLabel = contaLabel;
	}

	public JTextField getAgenciaField() {
		return agenciaField;
	}

	public void setAgenciaField(JTextField agenciaField) {
		this.agenciaField = agenciaField;
	}

	public JTextField getContaField() {
		return contaField;
	}

	public void setContaField(JTextField contaField) {
		this.contaField = contaField;
	}

	
	
}
