package one.digitalinnovation.model;

public class Endereco {
	
	private enum TipoEndereco{
		RESIDENCIAL, TRABALHO, ENTREGA;
	}
	
	private String estado;
	private String cidade;
	private String cep;
	private String bairro;
	private String logradouro;
	private String numero;
		
	public Endereco(String estado, String cidade, String cep, String bairro, String logradouro) {
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}
	
	public Endereco(String estado, String cidade, String cep, String bairro, String logradouro, String numero) {
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	
	

}
