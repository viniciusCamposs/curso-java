package cursojava.aula43;

import java.util.Arrays;

public class Aluno {

	private String curso;
	private double[] notas;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		// super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		return 0;
	}

	public boolean verificarAprovado() {
		return true;
	}

	// @Override
	public String obterEtiquetaEndereco() {

		String s = "Endereço do Aluno: ";
		// s+= super.getEndereco();

		return s;
	}

	// @Override
	public void imprimrEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
	
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	/*
	 * @Override public String toString() { String s = curso + "\n"; for(double nota
	 * : notas) { s += nota + " "; } return s; }
	 */

}
