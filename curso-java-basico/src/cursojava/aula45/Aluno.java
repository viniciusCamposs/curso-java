package cursojava.aula45;

public class Aluno extends Pessoa{
	
	private String curso;
	private double[] notas;
	
	

	public Aluno() {
		super();
	}
	
	

	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
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
	
	@Override
	public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do Aluno: ";
		s+= super.getEndereco();
		
		return s;
	}


}
