package cursojava.aula24;

public class Exercicio01 {
	
	/* Declaração das variáveis */
	String tipo;
	double preco;
	
	/* Criação dos métodos construtores */ 
	
	public Exercicio01() {
	
	}
	
	public Exercicio01(String tipo, double preco) {
		this.tipo = tipo;
		this.preco = preco;
	}
	
	/* Criação dos métodos da classe */
	public void imprimeDados(Exercicio01 lampada) {
		System.out.println("Tipo da lâmpada: " + lampada.tipo + 
						   "\nPreço: " + lampada.preco);	 
	}
}
