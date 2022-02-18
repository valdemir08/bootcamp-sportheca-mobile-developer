package one.digitalinnovation.model;

import java.util.ArrayList;

public class Banco {
	
	private String nome;
	private String cnpj;

	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

}
