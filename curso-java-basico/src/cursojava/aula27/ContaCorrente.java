package cursojava.aula27;

public class ContaCorrente {
	
	/* Declara��o das vari�veis */
	int numero;
	double saldo;
	String status;
	double limite; 
	
	/* Cria��o dos m�todos construtores */
	ContaCorrente() {
		
	}	
	
	ContaCorrente(int numero, double saldo, String status, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	/* Cria��o dos m�todos da classe */
	void imprimeDados(ContaCorrente conta) {
		System.out.println("\nN�mero da conta: " + conta.numero + 
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
		System.out.println("\nSaldo dispon�vel: " + conta.saldo);
	}
	
	void verificarCheque(ContaCorrente conta) {
		System.out.println("\nTipo do cheque: " + conta.status);
	}
	
}
