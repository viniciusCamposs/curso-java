package cursojava.aula36.exercicios;

import java.util.Scanner;

public class Exer02 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){

			System.out.println("-=-=-=-=-=-= Cadastro do Curso -=-=-=-=-=-=");
			Curso curso = new Curso();
			
			System.out.println("Nome do curso: ");
			curso.setNome(scan.next());
			
			System.out.println("Horário do curso: ");
			curso.setHorario(scan.next());
			
			System.out.println("-=-=-=-=-=-= Cadastro do Professor -=-=-=-=-=-=");
			Professor prof = new Professor();
			
			System.out.println("Nome: ");
			prof.setNome(scan.next());
			
			System.out.println("E-mail: ");
			prof.setEmail(scan.next());
			
			System.out.println("Departamento: ");
			prof.setDepartamento(scan.next());
			
			curso.setProfessor(prof);
			
			System.out.println("-=-=-=-=-=-= Cadastro dos Alunos -=-=-=-=-=-=");

			Aluno[] alunos = new Aluno[2];
			
			for(int i=0; i<alunos.length; i++) {
				System.out.println("-=-=-=-=-=-= " + (i+1) + "º Aluno -=-=-=-=-=-=");
				System.out.println("Nome: ");
				String nomeAluno = scan.next();
				
				System.out.println("Matricula: ");
				String matAluno = scan.next();
				
				double[] notas = new double[4];
				for(int j=0; j<4; j++) {
					System.out.println("Nota " + (j+1) + ": ");
					notas[j] = scan.nextDouble();
				}
				
				Aluno aluno = new Aluno();
				aluno.setNotas(notas);
				aluno.setNome(nomeAluno);
				aluno.setMatricula(matAluno);
				
				alunos[i] = aluno;
			}
			
			curso.setAlunos(alunos);
			
			System.out.println(curso.obterInfo());
			

		}
		
	}
}
