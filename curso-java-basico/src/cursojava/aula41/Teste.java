package cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 01");
		aluno.setEndereco("Rua 02");
		professor.setEndereco("Rua 03");
	
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimrEtiquetaEndereco();
		professor.imprimrEtiquetaEndereco();

	}

}
