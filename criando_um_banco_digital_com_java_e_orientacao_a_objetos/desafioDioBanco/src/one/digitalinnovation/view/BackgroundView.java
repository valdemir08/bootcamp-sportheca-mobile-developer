package one.digitalinnovation.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class BackgroundView extends JPanel{
	private JLabel imgLabel;
	private ImageIcon imageIcon;
	
	public BackgroundView() {
		setLayout(new FlowLayout());
		
		
		
		imageIcon = new ImageIcon("img/piggy-bank.png");
		Image image = imageIcon.getImage();
		Image newImg = image.getScaledInstance(270, 260,  java.awt.Image.SCALE_SMOOTH);  
		imageIcon = new ImageIcon(newImg);
		imgLabel = new JLabel(imageIcon, SwingConstants.CENTER);
		
		add(imgLabel);
		setVisible(true);
		
		
	}

}
