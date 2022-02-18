package one.digitalinnovation.view;

import javax.swing.JOptionPane;

public class Message extends JOptionPane{
	
	public static void showMessage(String mensagem) {
		showMessageDialog(null, mensagem);
	}

}
