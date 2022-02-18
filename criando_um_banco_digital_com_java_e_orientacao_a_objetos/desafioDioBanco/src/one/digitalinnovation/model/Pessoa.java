package one.digitalinnovation.model;

import one.digitalinnovation.view.Message;

public abstract class Pessoa {
	
	private enum TipoPessoa{
		FISICA, JURIDICA;
	}

	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;
	
	private String nome;
	private String documento;
	private TipoPessoa tipo;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	
	public boolean setDocumento(String documento) throws RuntimeException{
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		
		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, TipoPessoa.FISICA);
			return true;
		}else if(documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, TipoPessoa.JURIDICA);
			return true;
		}else {
			throw new RuntimeException("Documento inválido para pessoa fisica ou jurídica");
		}
		
	}
	
	private void setDocumento(String documento, TipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
	public TipoPessoa getTipo() {
		return tipo;
	}
	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}
	
	

}
