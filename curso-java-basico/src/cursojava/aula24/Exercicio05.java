package cursojava.aula24;

public class Exercicio05 {
	
	/* Declara��o das vari�veis */
	int numero;
	double saldo;
	String status;
	double limite; 
	
	/* Cria��o dos m�todos construtores */
	public Exercicio05() {
		
	}	
	
	public Exercicio05(int numero, double saldo, String status, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	/* Cria��o dos m�todos da classe */
	public void imprimeDados(Exercicio05 conta) {
		System.out.println("N�mero da conta: " + conta.numero + 
						   "\nSaldo: " + conta.saldo + 
						   "\nStatus: " + conta.status + 
						   "\nLimite: " + conta.limite);
	}
	
}
