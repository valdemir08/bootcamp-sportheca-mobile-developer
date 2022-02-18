package one.digitalinnovation.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class RemoverContainer extends JPanel{
	private RemoverPanel removerPanel;
	private JLabel tituloLabel;
	private JButton confirmarButton, cancelarButton;
	private JPanel botoesPanel;
	
	public RemoverContainer() {
		setLayout(new BorderLayout());
		
		this.removerPanel = new RemoverPanel();
		
		tituloLabel = new JLabel("Remoção de Conta", SwingConstants.CENTER);
		tituloLabel.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
		
		
		confirmarButton = new JButton("Confirmar");
		confirmarButton.setBackground(new Color(0, 204, 0));
		
		cancelarButton = new JButton("Cancelar");
		cancelarButton.setBackground(new Color(204, 0, 0));
		
		botoesPanel = new JPanel();
		botoesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));
		botoesPanel.add(confirmarButton);
		botoesPanel.add(cancelarButton);
		
		add(BorderLayout.NORTH, tituloLabel);
		add(BorderLayout.CENTER, removerPanel);
		add(botoesPanel, BorderLayout.SOUTH);
	}

	public RemoverPanel getRemoverPanel() {
		return removerPanel;
	}

	public void setRemoverPanel(RemoverPanel removerPanel) {
		this.removerPanel = removerPanel;
	}

	public JLabel getTituloLabel() {
		return tituloLabel;
	}

	public void setTituloLabel(JLabel tituloLabel) {
		this.tituloLabel = tituloLabel;
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
