package cursojava.aula27;

public class Alunos {
	/* Declaração das variáveis */
	String nome;
	String matricula;
	String curso;
	String[] nomeDisciplinas = new String[3];
	double[][] notasdisciplinas = new double[3][4];
	
	
	/* Criação dos métodos da classe */
	
	void imprimirDados() {
		System.out.println("Nome: " + this.nome +  
						   "\nMatricula: " + this.matricula + 
						   "\nNome do curso: " + this.curso);
		
		for(int i=0; i<notasdisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for(int j=0; j<notasdisciplinas[i].length; j++) {
				System.out.print(notasdisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
		
	boolean verificarAprovado(int indice) {
		
		if(obterMedia(indice) >=7 ) {
			return true;
		}
		return false;
	}
	
	double obterMedia(int indice ) {
		double soma = 0;
		
		for(int i=0; i<notasdisciplinas[indice].length; i++) {
			soma += notasdisciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		if(media >=7 ) {
			return media;
		}
		return media;
	}
		
	
	void verificarAprovacao(Alunos aluno) {
		
	}
	
	
}
