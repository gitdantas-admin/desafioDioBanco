package desafioDioBanco;

public class ContaCorrente extends Conta {
	
	

	public ContaCorrente(Cliente titular) {
		super(titular);
		
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		super.investir(saldo);
	
	}
}
