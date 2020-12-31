package cursojava.aula41;

public class Professor extends Pessoa {

	private String departamento;
	private double salario;
	private String nomeCurso;

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double calcularSalarioLiquido() {
		return 0;
	}
	
	@Override
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Professor: ";
		s+= super.getEndereco();
		
		return s;
	}
	
	@Override
	public void imprimrEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do Professor\n");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
