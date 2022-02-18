package one.digitalinnovation.main;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import one.digitalinnovation.controller.Controller;
import one.digitalinnovation.model.Cliente;
import one.digitalinnovation.model.Conta;
import one.digitalinnovation.model.ContaCorrente;
import one.digitalinnovation.model.ContaPoupanca;
import one.digitalinnovation.model.DataBase;
import one.digitalinnovation.view.BancoView;
import one.digitalinnovation.view.CadastroContainer;
import one.digitalinnovation.view.CadastroPanel;
import one.digitalinnovation.view.TesteFrame;

public class Main {

	public static void main(String[] args) {
		DataBase.init();
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    
		}

		new Controller();

	}

}
