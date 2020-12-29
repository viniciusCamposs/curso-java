package cursojava.aula33.exercicio02;

public class ContaCorrente {

	private int numero;
	private double saldo;
	private String status;
	private double limite; 
	
	ContaCorrente() {
	}	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	ContaCorrente(int numero, double saldo, String status, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	public void imprimeDados(ContaCorrente conta) {
		System.out.println("\nNúmero da conta: " + conta.getNumero() + 
						   "\nSaldo: " + conta.getSaldo() + 
						   "\nStatus: " + conta.getStatus() + 
						   "\nLimite: " + conta.getLimite());
	}
	
	private double verificaRealizarSaque(double valor) {
		if(this.saldo < valor) {
			System.out.println("\nSaldo insuficiente!");
		}else {
			return this.saldo -= valor;
		}
		return -1;
	}
	
	public double realizarSaque(double valor) {
		return verificaRealizarSaque(valor);
	} 
	
	public double depositarDinheiro(double valor) {
		return this.saldo += valor;
	}
	
	public void consultarSaldo(ContaCorrente conta) {
		System.out.println("\nSaldo disponível: " + conta.getSaldo());
	}
	
	public void verificarCheque(ContaCorrente conta) {
		System.out.println("\nTipo do cheque: " + conta.getStatus());
	}
}
