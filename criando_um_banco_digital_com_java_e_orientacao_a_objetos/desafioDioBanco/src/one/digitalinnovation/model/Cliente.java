package one.digitalinnovation.model;

import java.util.ArrayList;

import one.digitalinnovation.view.Message;

public class Cliente extends Pessoa{
	
	private int idade;
	private String senha;
	private ArrayList<Endereco> enderecos;
	
	public Cliente(String nome, Endereco endereco) {
		super(nome);
		enderecos = new ArrayList<Endereco>();
		try {
			addEndereco(endereco);
		} catch (EnderecoNullException e) {
			e.printStackTrace();
			Message.showMessage(e.getMessage());
		}
	}
	
	public boolean addEndereco(Endereco endereco) throws EnderecoNullException {
		if (endereco != null) {
			enderecos.add(endereco);
			return true;
		}
		throw new EnderecoNullException("Nao foi possivel adicionar. Endereco nulo.");
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
