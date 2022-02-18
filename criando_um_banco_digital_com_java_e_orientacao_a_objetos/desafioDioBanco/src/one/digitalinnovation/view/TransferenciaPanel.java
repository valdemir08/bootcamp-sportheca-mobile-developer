package one.digitalinnovation.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import one.digitalinnovation.model.SpringUtilities;

public class TransferenciaPanel extends JPanel{
	
	private JLabel agenciaOrigemLabel, contaOrigemLabel;
	private JTextField agenciaOrigemField, contaOrigemField;
	
	private JLabel agenciaDestinoLabel, contaDestinoLabel, valorLabel;
	private JTextField agenciaDestinoField, contaDestinoField, valorField;
	
	
	
	public TransferenciaPanel() {
		setLayout(new SpringLayout());
		
		agenciaOrigemLabel = new JLabel("Agencia Origem");
		agenciaOrigemField = new JTextField(10);
		
		contaOrigemLabel = new JLabel("Conta Origem");
		contaOrigemField = new JTextField(10);
	
		agenciaDestinoLabel = new JLabel("Agencia Destino");
		agenciaDestinoField = new JTextField(10);
		
		contaDestinoLabel = new JLabel("Conta Destino");
		contaDestinoField = new JTextField(10);
		
		valorLabel = new JLabel("Valor");
		valorField = new JTextField(10);
		
		
		
		
		add(agenciaOrigemLabel);
		add(agenciaOrigemField);
		add(contaOrigemLabel);
		add(contaOrigemField);
		
		add(agenciaDestinoLabel);
		add(agenciaDestinoField);
		add(contaDestinoLabel);
		add(contaDestinoField);
		
		add(valorLabel);
		add(valorField);
		
		SpringUtilities.makeCompactGrid(this, 5, 2, 30, 20, 30, 10);
	}

	public JLabel getAgenciaOrigemLabel() {
		return agenciaOrigemLabel;
	}

	public void setAgenciaOrigemLabel(JLabel agenciaOrigemLabel) {
		this.agenciaOrigemLabel = agenciaOrigemLabel;
	}

	public JLabel getContaOrigemLabel() {
		return contaOrigemLabel;
	}

	public void setContaOrigemLabel(JLabel contaOrigemLabel) {
		this.contaOrigemLabel = contaOrigemLabel;
	}

	public JTextField getAgenciaOrigemField() {
		return agenciaOrigemField;
	}

	public void setAgenciaOrigemField(JTextField agenciaOrigemField) {
		this.agenciaOrigemField = agenciaOrigemField;
	}

	public JTextField getContaOrigemField() {
		return contaOrigemField;
	}

	public void setContaOrigemField(JTextField contaOrigemField) {
		this.contaOrigemField = contaOrigemField;
	}

	public JLabel getAgenciaDestinoLabel() {
		return agenciaDestinoLabel;
	}

	public void setAgenciaDestinoLabel(JLabel agenciaDestinoLabel) {
		this.agenciaDestinoLabel = agenciaDestinoLabel;
	}

	public JLabel getContaDestinoLabel() {
		return contaDestinoLabel;
	}

	public void setContaDestinoLabel(JLabel contaDestinoLabel) {
		this.contaDestinoLabel = contaDestinoLabel;
	}

	public JTextField getAgenciaDestinoField() {
		return agenciaDestinoField;
	}

	public void setAgenciaDestinoField(JTextField agenciaDestinoField) {
		this.agenciaDestinoField = agenciaDestinoField;
	}

	public JTextField getContaDestinoField() {
		return contaDestinoField;
	}

	public void setContaDestinoField(JTextField contaDestinoField) {
		this.contaDestinoField = contaDestinoField;
	}

	public JLabel getValorLabel() {
		return valorLabel;
	}

	public void setValorLabel(JLabel valorLabel) {
		this.valorLabel = valorLabel;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public void setValorField(JTextField valorField) {
		this.valorField = valorField;
	}

	

	
	
	

	
	
}
