package cursojava.aula33.exercicio03;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] nomeDisciplinas = new String[3];
	private double[][] notasdisciplinas = new double[3][4];

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}

	public double[][] getNotasdisciplinas() {
		return notasdisciplinas;
	}

	public void setNotasdisciplinas(double[][] notasdisciplinas) {
		this.notasdisciplinas = notasdisciplinas;
	}
	
	
	public void setNotasPosIJ(int i, int j, double nota) {
		this.notasdisciplinas[i][j] = nota;
	}


	void imprimirDados() {
		System.out.println("Nome: " + getNome() + "\nMatricula: " + getMatricula() + "\nNome do curso: " + getCurso());

		for (int i = 0; i < notasdisciplinas.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasdisciplinas[i].length; j++) {
				System.out.print(notasdisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}

	boolean verificarAprovado(int indice) {

		if (obterMedia(indice) >= 7) {
			return true;
		}
		return false;
	}

	double obterMedia(int indice) {
		double soma = 0;

		for (int i = 0; i < notasdisciplinas[indice].length; i++) {
			soma += notasdisciplinas[indice][i];
		}

		double media = soma / 4;

		if (media >= 7) {
			return media;
		}
		return media;
	}
}
