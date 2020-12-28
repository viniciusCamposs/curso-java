package cursojava.aula24;

public class Exercicio06 {

	/* Declaração das variáveis */
	String nome;
	int ddd;
	String numero;
	
	/* Criação dos métodos construtores */ 
	public Exercicio06() {
		
	}
	
	public Exercicio06(String nome, int ddd, String numero) {
		this.nome = nome;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	/* Criação dos métodos da clase */ 
	public void imprimeDados(Exercicio06 contato) {
		System.out.println("Nome do contato: " + contato.nome + 
					       "\nDDD: " + contato.ddd + 
					       "\nNúmero: " + contato.numero);
	}
	
	

}
