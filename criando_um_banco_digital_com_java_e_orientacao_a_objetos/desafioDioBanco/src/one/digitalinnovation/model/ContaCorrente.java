package one.digitalinnovation.model;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}





	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta corrente ===");
		imprimirInfoComuns();
		
	}

}
