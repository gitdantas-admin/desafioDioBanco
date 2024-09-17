package desafioDioBanco;

public class Cliente {
	
	private String titular;
	
	public Cliente(String titular) {
		this.titular = titular;
		
	}


	public String getNome() {
		return titular;
	}

	public void setNome(String titular) {
		this.titular = titular;
	}


	@Override
	public String toString() {
		return "Cliente [titular=" + titular + "]";
	}


	
	
	


}
