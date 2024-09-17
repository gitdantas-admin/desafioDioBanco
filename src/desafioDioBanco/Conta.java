package desafioDioBanco;


public abstract class Conta implements InterConta {
	
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	
	protected int numero;
	
	protected double saldo;
	
	protected Conta conta;
	
	protected Cliente titular;
	
	

	public Conta(Cliente titular) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.agencia = SEQUENCIAL++;
		this.titular = titular;
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



	@Override
	public void sacar(double valor) {
		if(saldo > valor)
			saldo -= valor;
		
	}



	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}



	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfosComuns() {
	System.out.println(String.format("Cliente: %s", this.titular));
	System.out.println(String.format("Agência: %d", this.agencia));
	System.out.println(String.format("Número: %d", this.numero));
	System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
	protected void investir(double valor) {
		
		double rendimento = valor * 0.15;
		
		System.out.println(String.format("O seu rendimento foi de %.2f", rendimento));
		
	
	}


	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", conta=" + conta
				+ ", titular=" + titular + "]";
	}
	
	

	
}
