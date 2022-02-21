package one.digitalinnovation.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import one.digitalinnovation.model.Cliente;
import one.digitalinnovation.model.Constantes;
import one.digitalinnovation.model.Conta;
import one.digitalinnovation.model.ContaCorrente;
import one.digitalinnovation.model.ContaExisteException;
import one.digitalinnovation.model.ContaNaoExisteException;
import one.digitalinnovation.model.ContaPoupanca;
import one.digitalinnovation.model.DataBase;
import one.digitalinnovation.model.Endereco;
import one.digitalinnovation.view.BancoView;
import one.digitalinnovation.view.CadastroContainer;
import one.digitalinnovation.view.CadastroPanel;
import one.digitalinnovation.view.Message;
import one.digitalinnovation.view.RemoverContainer;
import one.digitalinnovation.view.RemoverPanel;
import one.digitalinnovation.view.TransferenciaContainer;
import one.digitalinnovation.view.TransferenciaPanel;

public class Controller {
	private CadastroController cadastroController;
	private BancoController bancoController;
	private RemoverController removerController;
	private TransferenciaController transferenciaController;

	public Controller() {
		cadastroController = new CadastroController();
		removerController = new RemoverController();
		transferenciaController = new TransferenciaController();
		
		bancoController = new BancoController();
		
	}
	
	private class TransferenciaController implements ActionListener{
		private TransferenciaPanel transferenciaPanel;
		private TransferenciaContainer transferenciaContainer;
		
		public TransferenciaController() {
			this.transferenciaContainer = new TransferenciaContainer();
			this.transferenciaPanel = this.transferenciaContainer.getTransferenciaPanel();
			control();
		}
		
		public void control() {
			
			transferenciaContainer.getConfirmarButton().addActionListener(this);
			transferenciaContainer.getCancelarButton().addActionListener(this);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == transferenciaContainer.getConfirmarButton()) {
				
				Conta contaOrigem = new ContaCorrente(Integer.parseInt(transferenciaPanel.getAgenciaOrigemField().getText()),
						Integer.parseInt(transferenciaPanel.getContaOrigemField().getText()));
				Conta contaDestino = new ContaCorrente(Integer.parseInt(transferenciaPanel.getAgenciaDestinoField().getText()),
						Integer.parseInt(transferenciaPanel.getContaDestinoField().getText()));
				if (contaOrigem.transferir(Double.parseDouble(transferenciaPanel.getValorField().getText()), contaDestino)) {
					Message.showMessage(Constantes.MENSAGEM_SUCESSO);
				}
				
			}
			
			
			if (e.getSource() == transferenciaContainer.getCancelarButton()) {
				transferenciaContainer.setVisible(false);
				
			}
			
			
		}

		public TransferenciaPanel getTransferenciaPanel() {
			return transferenciaPanel;
		}

		public void setTransferenciaPanel(TransferenciaPanel transferenciaPanel) {
			this.transferenciaPanel = transferenciaPanel;
		}

		public TransferenciaContainer getTransferenciaContainer() {
			return transferenciaContainer;
		}

		public void setTransferenciaContainer(TransferenciaContainer transferenciaContainer) {
			this.transferenciaContainer = transferenciaContainer;
		}
		
		
		
	}
	
	private void hidePanels() {
		removerController.getRemoverContainer().setVisible(false);
		cadastroController.getCadastroContainer().setVisible(false);
		transferenciaController.getTransferenciaContainer().setVisible(false);
		bancoController.getBancoView().getBcView().setVisible(false);
		
	}
	
	private class BancoController implements ActionListener{
		private BancoView bancoView;

		public BancoController() {
			this.bancoView = new BancoView();
			control();

		}
		
		public void control() {
			bancoView.getCadastrarMenuItem().addActionListener(this);
			bancoView.getRemoverMenuItem().addActionListener(this);
			
			bancoView.getTransferenciaMenu().addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					hidePanels();
					bancoView.switchContainer(transferenciaController.getTransferenciaContainer());
					transferenciaController.getTransferenciaContainer().setVisible(true);
					
				}
				
				
			});
			
			bancoView.getExitMenu().addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					super.mouseClicked(e);
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja Sair da aplicacao?");
					if(escolha == 0)
						System.exit(0);
				}
				
				
			});
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == bancoView.getCadastrarMenuItem()) {
				hidePanels();
				bancoView.switchContainer(cadastroController.getCadastroContainer());
				cadastroController.getCadastroContainer().setVisible(true);
			}
			if(e.getSource() == bancoView.getRemoverMenuItem()) {
				hidePanels();
				bancoView.switchContainer(removerController.getRemoverContainer());
				removerController.getRemoverContainer().setVisible(true);
			}
			bancoView.repaint();
			
		}

		public BancoView getBancoView() {
			return bancoView;
		}

		public void setBancoView(BancoView bancoView) {
			this.bancoView = bancoView;
		}
		
		

	}
	
	private class RemoverController implements ActionListener{
		private RemoverPanel removerPanel;
		private RemoverContainer removerContainer;
		
		public RemoverController() {
			this.removerContainer = new RemoverContainer();
			this.removerPanel = removerContainer.getRemoverPanel();
			control();
		}

		public void control() {
			removerContainer.getConfirmarButton().addActionListener(this);
			removerContainer.getCancelarButton().addActionListener(this);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == removerContainer.getConfirmarButton()) {
				try {
					if (DataBase.removeConta(new ContaCorrente(Integer.parseInt(removerPanel.getAgenciaField().getText()),
							Integer.parseInt(removerPanel.getContaField().getText())))) {
						Message.showMessage(Constantes.MENSAGEM_SUCESSO);
					}
				} catch (NumberFormatException | ContaNaoExisteException e1) {
					e1.printStackTrace();
					Message.showMessage(e1.getMessage());
				}
			}
			if (e.getSource() == removerContainer.getCancelarButton()) {
				removerContainer.setVisible(false);
				
			}
		}

		public RemoverPanel getRemoverPanel() {
			return removerPanel;
		}

		public void setRemoverPanel(RemoverPanel removerPanel) {
			this.removerPanel = removerPanel;
		}

		public RemoverContainer getRemoverContainer() {
			return removerContainer;
		}

		public void setRemoverContainer(RemoverContainer removerContainer) {
			this.removerContainer = removerContainer;
		}	
	}

	

	private class CadastroController implements ActionListener{
		private CadastroPanel cadastroPanel;
		private CadastroContainer cadastroContainer;

		public CadastroController(){
			this.cadastroContainer = new CadastroContainer();
			this.cadastroPanel = cadastroContainer.getCadastroPanel();
			control();
		}

		public void control() {
			cadastroContainer.getConfirmarButton().addActionListener(this);
			cadastroContainer.getCancelarButton().addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == cadastroContainer.getConfirmarButton()) {

				Endereco endereco = new Endereco(cadastroPanel.getEstadoComboBox().getSelectedItem().toString(),
						cadastroPanel.getCidadeField().getText(), cadastroPanel.getCepField().getText(),
						cadastroPanel.getBairroField().getText(), cadastroPanel.getLogradouroField().getText());

				Cliente cliente = new Cliente(cadastroPanel.getNomeField().getText(), endereco);
				
				try {
					if (cliente.setDocumento(cadastroPanel.getDocumentoField().getText())) {
						try {
							DataBase.addConta(new ContaCorrente(cliente));
							DataBase.addConta(new ContaPoupanca(cliente));
							Message.showMessage(Constantes.MENSAGEM_SUCESSO);
						} catch (NullPointerException | ContaExisteException e1) {
							e1.printStackTrace();
							Message.showMessage(e1.getMessage());
						}
					}
				} catch (Exception e2) {
					Message.showMessage(e2.getMessage());
				}

			}
			if(e.getSource() == cadastroContainer.getCancelarButton()) {
				cadastroContainer.setVisible(false);
			}


		}
		public CadastroPanel getCadastroPanel() {
			return cadastroPanel;
		}

		public void setCadastroPanel(CadastroPanel cadastroPanel) {
			this.cadastroPanel = cadastroPanel;
		}

		public CadastroContainer getCadastroContainer() {
			return cadastroContainer;
		}

		public void setCadastroContainer(CadastroContainer cadastroContainer) {
			this.cadastroContainer = cadastroContainer;
		}
	}

}
