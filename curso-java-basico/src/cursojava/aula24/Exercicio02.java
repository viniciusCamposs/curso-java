package cursojava.aula24;

public class Exercicio02 {

	/* Declaração das variáveis */
	String nome;
	String autor;
	String editora;
	int numPaginas;
	double preco;
	
	/* Criação dos construtores */
	public Exercicio02() {
		
	}
	
	public Exercicio02(String nome, String autor, String editora, int numPaginas, double preco) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.preco = preco;
	}
	
	/* Criação dos métodos da classe */
	public void imprimeDados(Exercicio02 livro) {
		System.out.println("Nome do livro: " + livro.nome + 
						   "\nAutor: " + livro.autor + 
						   "\nEditora: " + livro.editora + 
						   "\nNúmero de páginas: " + livro.numPaginas +
						   "\nPreço: " + livro.preco);	
	}
	
}
