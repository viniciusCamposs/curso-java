package cursojava.aula24;

public class Exercicio06 {

	/* Declara��o das vari�veis */
	String nome;
	int ddd;
	String numero;
	
	/* Cria��o dos m�todos construtores */ 
	public Exercicio06() {
		
	}
	
	public Exercicio06(String nome, int ddd, String numero) {
		this.nome = nome;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	/* Cria��o dos m�todos da clase */ 
	public void imprimeDados(Exercicio06 contato) {
		System.out.println("Nome do contato: " + contato.nome + 
					       "\nDDD: " + contato.ddd + 
					       "\nN�mero: " + contato.numero);
	}
	
	

}
