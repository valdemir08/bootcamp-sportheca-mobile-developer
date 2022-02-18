package one.digitalinnovation.model;

public interface IConta {

	public boolean sacar(double valor);

	public boolean depositar(double valor);

	public boolean transferir(double valor, IConta contaDestino);
	
	public void imprimirExtrato();

}
