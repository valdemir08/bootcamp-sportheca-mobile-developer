package poo.model;

public class Pessoa {
	
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;

	
	public enum TipoPessoa{
			FISICA, JURIDICA
	}
	
	private Integer codigo;
	private String nome;
	private String documento;
	private TipoPessoa tipo;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
	public void setDocumento(String documento) {
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		
		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento, TipoPessoa.FISICA);
		}else if(documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, TipoPessoa.JURIDICA);
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
