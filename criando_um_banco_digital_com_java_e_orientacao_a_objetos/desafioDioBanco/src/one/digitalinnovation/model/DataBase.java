package one.digitalinnovation.model;

import java.util.ArrayList;

import one.digitalinnovation.view.Message;

public class DataBase {
	private static ArrayList<Conta> contas;
	
	public static void init() {
		contas = new ArrayList<Conta>();
	}
	
	public static Conta searchConta(Conta conta) {
		for(Conta contaCurrent:contas) 
			if(conta.getAgencia() == contaCurrent.getAgencia() && 
					conta.getNumero() == contaCurrent.getNumero())
				return contaCurrent;
		return null;
	}
	
	public static boolean isConta(Conta conta) {
		return contas.contains(searchConta(conta));
	}
	
	public static boolean addConta(Conta conta) throws ContaExisteException, NullPointerException{
		if(conta != null) {
			if(!isConta(conta))//para nao adicionar contas que ja existam no arrayList
				return contas.add(conta);
			else
				throw new ContaExisteException("impossivel adicionar. A conta já existe na base de dados");
		}
		throw new NullPointerException("Conta não pode ser nula");
	}
	
	public static boolean removeConta(Conta conta) throws ContaNaoExisteException{
		if(contas.remove(searchConta(conta))) {
			return true;
		}else {
			throw new ContaNaoExisteException("impossivel remover. A conta nao existe na base de dados");
		}
	}

}
