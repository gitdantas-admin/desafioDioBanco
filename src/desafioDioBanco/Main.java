package desafioDioBanco;

public class Main {

	public static void main(String[] args) {
		
		Cliente carlos = new Cliente("carlos");
		Cliente ivana = new Cliente("ivana");
		Conta cc = new ContaCorrente(ivana);
		Conta cp = new Poupanca(carlos);
		Banco lista = new Banco();
		
		cc.depositar(100);
		cp.depositar(100);
		
		cc.sacar(50);
		
		cp.transferir(50, cc);
		
		cc.investir(40);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		lista.adicionarConta(cp);
		lista.adicionarConta(cc);
		lista.exibirClientes();
		

	}

}
