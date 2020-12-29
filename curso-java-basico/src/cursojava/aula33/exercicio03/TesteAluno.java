package cursojava.aula33.exercicio03;

import java.util.Scanner;


public class TesteAluno {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			Aluno aluno = new Aluno();
			
			System.out.println("Entre com o nome do aluno: ");
			aluno.setNome(scan.next());
			
			System.out.println("Entre com o nome do curso: ");
			aluno.setCurso(scan.next());
			
			System.out.println("Entre com a matricula: ");
			aluno.setMatricula(scan.next());
			
			for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
				System.out.println("Entre com o nome da disciplina: ");
				aluno.setNomeDisciplinaPos(i, scan.next());
			}
			
			for(int i=0; i<aluno.getNotasdisciplinas().length; i++) {
				System.out.println("Obtendo notas da disciplina: " + aluno.getNomeDisciplinas()[i]);
				
				for(int j=0; j<aluno.getNotasdisciplinas()[i].length; j++) {
					System.out.println("Entre com a nota " + (j+1) + ": ");
					aluno.setNotasPosIJ(i, j, scan.nextDouble());
				}
			}
			
			aluno.imprimirDados();
			
			for(int i=0; i<aluno.getNomeDisciplinas().length; i++) {
				if(aluno.verificarAprovado(i)) {
					System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
				}else {
					System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi reprovado");
				}
				System.out.println("Média do aluno: " + aluno.obterMedia(i));
			}

		}

	}

}
