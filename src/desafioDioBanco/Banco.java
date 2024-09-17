package desafioDioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas;
	

	public Banco() {
		this.contas = new ArrayList<>();
	}
	
	 public void adicionarConta(Conta conta) {
	        contas.add(conta);
	    }

	public void exibirClientes(){
	    for (Conta c : contas) {
	        System.out.println(c);
	    }
	}

	


}
