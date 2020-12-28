package cursojava.aula24;

public class Exercicio05 {
	
	/* Declaração das variáveis */
	int numero;
	double saldo;
	String status;
	double limite; 
	
	/* Criação dos métodos construtores */
	public Exercicio05() {
		
	}	
	
	public Exercicio05(int numero, double saldo, String status, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}
	
	/* Criação dos métodos da classe */
	public void imprimeDados(Exercicio05 conta) {
		System.out.println("Número da conta: " + conta.numero + 
						   "\nSaldo: " + conta.saldo + 
						   "\nStatus: " + conta.status + 
						   "\nLimite: " + conta.limite);
	}
	
}
