package one.digitalinnovation.view;



import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import one.digitalinnovation.model.Banco;

public class BancoView extends JFrame{

	private JMenuBar menuBar;
	private JMenu clienteMenu, transferenciaMenu, exitMenu;
	private JMenuItem cadastrarMenuItem, removerMenuItem;
	private BackgroundView bcView;
	
	
	public BancoView() {
		super("Tela banco");
		
		
		setSize(300, 330);
		setLayout(new SpringLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		clienteMenu = new JMenu("Cliente");
		menuBar.add(clienteMenu);
		transferenciaMenu = new JMenu("Transferência");
		menuBar.add(transferenciaMenu);
		exitMenu = new JMenu("Exit");
		menuBar.add(exitMenu);
		
		
		cadastrarMenuItem = new JMenuItem("Cadastrar");
		removerMenuItem = new JMenuItem("Remover");
		
		clienteMenu.add(cadastrarMenuItem);
		clienteMenu.add(removerMenuItem);
		
		bcView = new BackgroundView();
		
		add(bcView);

		setVisible(true);

	}
	public void switchContainer(JPanel container) {
		add(container, BorderLayout.CENTER);
	}


	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}


	public JMenu getClienteMenu() {
		return clienteMenu;
	}


	public void setClienteMenu(JMenu clienteMenu) {
		this.clienteMenu = clienteMenu;
	}


	public JMenu getExitMenu() {
		return exitMenu;
	}


	public void setExitMenu(JMenu exitMenu) {
		this.exitMenu = exitMenu;
	}


	public JMenuItem getCadastrarMenuItem() {
		return cadastrarMenuItem;
	}


	public void setCadastrarMenuItem(JMenuItem cadastrarMenuItem) {
		this.cadastrarMenuItem = cadastrarMenuItem;
	}


	public JMenuItem getRemoverMenuItem() {
		return removerMenuItem;
	}


	public void setRemoverMenuItem(JMenuItem removerMenuItem) {
		this.removerMenuItem = removerMenuItem;
	}
	public JMenu getTransferenciaMenu() {
		return transferenciaMenu;
	}
	public void setTransferenciaMenu(JMenu transferenciaMenu) {
		this.transferenciaMenu = transferenciaMenu;
	}
	public BackgroundView getBcView() {
		return bcView;
	}
	public void setBcView(BackgroundView bcView) {
		this.bcView = bcView;
	}
	
	
	
	
	
	

}
