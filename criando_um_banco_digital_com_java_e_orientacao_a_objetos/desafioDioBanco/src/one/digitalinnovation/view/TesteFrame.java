package one.digitalinnovation.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class TesteFrame extends JFrame{
	
	public TesteFrame() {
		setLayout(new SpringLayout());
		setLocationRelativeTo(null);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new BackgroundView(), BorderLayout.CENTER);
		
		
		
		setVisible(true);
	}

}
