package one.digitalinnovation.model;

public abstract class Conta implements IConta{
	
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}




	@Override
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		saldo += valor;
		return true;
		
	}

	@Override
	public boolean transferir(double valor, IConta contaDestino) {
		if(sacar(valor) && contaDestino.depositar(valor))
			return true;
		return false;
		
	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	

	

}
