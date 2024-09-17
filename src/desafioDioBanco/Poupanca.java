package desafioDioBanco;

public class Poupanca extends Conta {

	
	
	public Poupanca(Cliente titular) {
		super(titular);
		
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		super.investir(saldo);
	
	}
	

}
