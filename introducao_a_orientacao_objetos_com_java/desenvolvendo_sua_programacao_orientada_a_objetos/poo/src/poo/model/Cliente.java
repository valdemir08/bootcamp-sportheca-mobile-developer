package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	
	public String numCarString;
	private List<Endereco> enderecos;
	
	
	public void adicionaEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endere�o n�o pode ser nulo");
		}
		if(endereco.cep == null) {
			throw new NullPointerException("cep n�o pode ser nulo"); 
		}
		getEnderecos().add(endereco);
	}
	
	
	
	private List<Endereco> getEnderecos() {
		if (enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
	

}
