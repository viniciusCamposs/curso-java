package cursojava.aula27;

public class ContaCorrente {
	
	/* Declaração das variáveis */
	int numero;
	double saldo;
	String status;
	double limite; 
	
	/* Criação dos métodos construtores */
	ContaCorrente() {
		
	}	
	
	ContaCorrente(int numero, double saldo, String status, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	/* Criação dos métodos da classe */
	void imprimeDados(ContaCorrente conta) {
		System.out.println("\nNúmero da conta: " + conta.numero + 
						   "\nSaldo: " + conta.saldo + 
						   "\nStatus: " + conta.status + 
						   "\nLimite: " + conta.limite);
	}
	
	double realizarSaque(double valor) {
		if(this.saldo < valor) {
			System.out.println("\nSaldo insuficiente!");
		}else {
			return this.saldo -= valor;
		}
		return -1;
	} 
	
	double depositarDinheiro(double valor) {
		return this.saldo += valor;
	}
	
	void consultarSaldo(ContaCorrente conta) {
		System.out.println("\nSaldo disponível: " + conta.saldo);
	}
	
	void verificarCheque(ContaCorrente conta) {
		System.out.println("\nTipo do cheque: " + conta.status);
	}
	
}
