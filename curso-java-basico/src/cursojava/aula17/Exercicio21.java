package cursojava.aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Quantidade de turmas: ");
			int turmas = scan.nextInt();
			
			int alunos;
			double soma=0, media;
			for(int i=0; i<turmas; i++) {
				System.out.println("-=-=-=-=-=-=-=-=-=-= TURMA " + (i+1) + "-=-=-=-=-=-=-=-=-=-= ");
				System.out.println("Quantidade de alunos: ");
				alunos = scan.nextInt();
				while(alunos>40) {
					System.out.println("-------> TURMA NÃO PODE TER MAIS DE 40 ALUNOS <-------");
					System.out.println("Quantidade de alunos: ");
					alunos = scan.nextInt();
				}
				
				soma += alunos;
			}
			
			media = soma/turmas;
			System.out.println("Média de alunos por turma: " + media);
		}

	}

}
