package cursojava.aula24;

public class Exercicio02 {

	/* Declara��o das vari�veis */
	String nome;
	String autor;
	String editora;
	int numPaginas;
	double preco;
	
	/* Cria��o dos construtores */
	public Exercicio02() {
		
	}
	
	public Exercicio02(String nome, String autor, String editora, int numPaginas, double preco) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.preco = preco;
	}
	
	/* Cria��o dos m�todos da classe */
	public void imprimeDados(Exercicio02 livro) {
		System.out.println("Nome do livro: " + livro.nome + 
						   "\nAutor: " + livro.autor + 
						   "\nEditora: " + livro.editora + 
						   "\nN�mero de p�ginas: " + livro.numPaginas +
						   "\nPre�o: " + livro.preco);	
	}
	
}
