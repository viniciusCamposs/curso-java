package cursojava.aula24;

public class Exercicio01 {
	
	/* Declara��o das vari�veis */
	String tipo;
	double preco;
	
	/* Cria��o dos m�todos construtores */ 
	
	public Exercicio01() {
	
	}
	
	public Exercicio01(String tipo, double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}
	
	/* Cria��o dos m�todos da classe */
	public void imprimeDados(Exercicio01 lampada) {
		System.out.println("Tipo da l�mpada: " + lampada.tipo + 
						   "\nPre�o: " + lampada.preco);	 
	}
}
