package one.digitalinnovation.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class CadastroContainer extends JPanel{

	private JPanel tituloPanel;
	private JLabel tituloLabel;
	private CadastroPanel cadastroPanel;
	private JScrollPane cadastroPanelScroll;
	private JButton confirmarButton, cancelarButton;
	private JPanel botoesPanel;
	
	public CadastroContainer() {
		setLayout(new BorderLayout());
		this.cadastroPanel = new CadastroPanel();
		
		tituloLabel = new JLabel("Cadastro de Conta", SwingConstants.CENTER);
		tituloLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
		
		cadastroPanelScroll = new JScrollPane(cadastroPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		cadastroPanelScroll.setPreferredSize(new Dimension(290, 210));
		cadastroPanelScroll.getVerticalScrollBar().setUnitIncrement(10);
		
		confirmarButton = new JButton("Confirmar");
		confirmarButton.setBackground(new Color(0, 204, 0));
		
		cancelarButton = new JButton("Cancelar");
		cancelarButton.setBackground(new Color(204, 0, 0));
		
		botoesPanel = new JPanel();
		botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
		botoesPanel.add(confirmarButton);
		botoesPanel.add(cancelarButton);
		
		add(tituloLabel, BorderLayout.NORTH);
		add(cadastroPanelScroll, BorderLayout.CENTER);
		add(botoesPanel, BorderLayout.SOUTH);
		
		
		
	}

	public JPanel getTituloPanel() {
		return tituloPanel;
	}

	public void setTituloPanel(JPanel tituloPanel) {
		this.tituloPanel = tituloPanel;
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public void setTituloLabel(JLabel tituloLabel) {
		this.tituloLabel = tituloLabel;
	}

	public CadastroPanel getCadastroPanel() {
		return cadastroPanel;
	}

	public void setCadastroPanel(CadastroPanel cadastroPanel) {
		this.cadastroPanel = cadastroPanel;
	}

	public JScrollPane getCadastroPanelScroll() {
		return cadastroPanelScroll;
	}

	public void setCadastroPanelScroll(JScrollPane cadastroPanelScroll) {
		this.cadastroPanelScroll = cadastroPanelScroll;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}

	public void setConfirmarButton(JButton confirmarButton) {
		this.confirmarButton = confirmarButton;
	}

	public JButton getCancelarButton() {
		return cancelarButton;
	}

	public void setCancelarButton(JButton cancelarButton) {
		this.cancelarButton = cancelarButton;
	}

	public JPanel getBotoesPanel() {
		return botoesPanel;
	}

	public void setBotoesPanel(JPanel botoesPanel) {
		this.botoesPanel = botoesPanel;
	}
	
	
}
