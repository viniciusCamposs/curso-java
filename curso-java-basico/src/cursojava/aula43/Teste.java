package cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setCurso("Ci�ncia da Computa��o");
		double[] notas = { 10, 9, 8, 7 };
		aluno.setNotas(notas);

		System.out.println(aluno);

		String s1 = "sdafas";
		String s2 = "Sdgsdgd";

		Aluno aluno2 = new Aluno();

		aluno2.setCurso("Ci�ncia da Computa��o");
		double[] notas2 = { 10, 9, 8, 7 };
		aluno2.setNotas(notas2);

		System.out.println(aluno.equals(aluno2));

	}

}
