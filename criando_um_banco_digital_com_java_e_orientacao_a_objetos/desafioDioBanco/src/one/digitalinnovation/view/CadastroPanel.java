package one.digitalinnovation.view;

import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import one.digitalinnovation.model.SpringUtilities;

public class CadastroPanel extends JPanel {

	private JLabel nomeLabel, documentoLabel, estadoLabel, cidadeLabel, cepLabel,
	bairroLabel, logradouroLabel, numeroLabel;

	private JTextField nomeField, documentoField, cidadeField, bairroField, logradouroField, numeroField;
	private JFormattedTextField cepField;
	private JComboBox estadoComboBox;
	
	private String[] estados = {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" };
	
	public CadastroPanel() {
		setLayout(new SpringLayout());
		
		nomeLabel = new JLabel("Nome");
		documentoLabel = new JLabel("CPF ou CNPJ");
		estadoLabel = new JLabel("Estado");
		cidadeLabel = new JLabel("Cidade");
		cepLabel = new JLabel("Cep");
		bairroLabel = new JLabel("Bairro");
		logradouroLabel = new JLabel("Logradouro");
		numeroLabel = new JLabel("Número");
		
		nomeField = new JTextField(10);
		documentoField = new JTextField(10);
		cidadeField = new JTextField(10);
		bairroField = new JTextField(10);
		logradouroField = new JTextField(10);
		numeroField = new JTextField(10);
		
		try {
			cepField = new JFormattedTextField(new MaskFormatter("#####-###"));
			cepField.setColumns(10);

		} catch (ParseException e) {
			e.printStackTrace();
		}

		estadoComboBox = new JComboBox(estados);
		
		add(nomeLabel);
		add(nomeField);
		
		add(documentoLabel);
		add(documentoField);
		
		add(estadoLabel);
		add(estadoComboBox);
		
		add(cidadeLabel);
		add(cidadeField);
		
		add(cepLabel);
		add(cepField);
		
		add(bairroLabel);
		add(bairroField);
		
		add(logradouroLabel);
		add(logradouroField);
		
		add(numeroLabel);
		add(numeroField);
		
		SpringUtilities.makeCompactGrid(this, 8, 2, 20, 10, 30, 8);



	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public void setNomeLabel(JLabel nomeLabel) {
		this.nomeLabel = nomeLabel;
	}

	public JLabel getDocumentoLabel() {
		return documentoLabel;
	}

	public void setDocumentoLabel(JLabel documentoLabel) {
		this.documentoLabel = documentoLabel;
	}

	public JLabel getEstadoLabel() {
		return estadoLabel;
	}

	public void setEstadoLabel(JLabel estadoLabel) {
		this.estadoLabel = estadoLabel;
	}

	public JLabel getCidadeLabel() {
		return cidadeLabel;
	}

	public void setCidadeLabel(JLabel cidadeLabel) {
		this.cidadeLabel = cidadeLabel;
	}

	public JLabel getCepLabel() {
		return cepLabel;
	}

	public void setCepLabel(JLabel cepLabel) {
		this.cepLabel = cepLabel;
	}

	public JLabel getBairroLabel() {
		return bairroLabel;
	}

	public void setBairroLabel(JLabel bairroLabel) {
		this.bairroLabel = bairroLabel;
	}

	public JLabel getLogradouroLabel() {
		return logradouroLabel;
	}

	public void setLogradouroLabel(JLabel logradouroLabel) {
		this.logradouroLabel = logradouroLabel;
	}

	public JLabel getNumeroLabel() {
		return numeroLabel;
	}

	public void setNumeroLabel(JLabel numeroLabel) {
		this.numeroLabel = numeroLabel;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public void setNomeField(JTextField nomeField) {
		this.nomeField = nomeField;
	}

	public JTextField getDocumentoField() {
		return documentoField;
	}

	public void setDocumentoField(JTextField documentoField) {
		this.documentoField = documentoField;
	}

	public JTextField getCidadeField() {
		return cidadeField;
	}

	public void setCidadeField(JTextField cidadeField) {
		this.cidadeField = cidadeField;
	}

	public JTextField getBairroField() {
		return bairroField;
	}

	public void setBairroField(JTextField bairroField) {
		this.bairroField = bairroField;
	}

	public JTextField getLogradouroField() {
		return logradouroField;
	}

	public void setLogradouroField(JTextField logradouroField) {
		this.logradouroField = logradouroField;
	}

	public JTextField getNumeroField() {
		return numeroField;
	}

	public void setNumeroField(JTextField numeroField) {
		this.numeroField = numeroField;
	}

	public JFormattedTextField getCepField() {
		return cepField;
	}

	public void setCepField(JFormattedTextField cepField) {
		this.cepField = cepField;
	}

	public JComboBox getEstadoComboBox() {
		return estadoComboBox;
	}

	public void setEstadoComboBox(JComboBox estadoComboBox) {
		this.estadoComboBox = estadoComboBox;
	}

	public String[] getEstados() {
		return estados;
	}

	public void setEstados(String[] estados) {
		this.estados = estados;
	}
	
	

}
