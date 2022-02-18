package one.digitalinnovation.model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupanca ===");
		imprimirInfoComuns();
		
	}

}
