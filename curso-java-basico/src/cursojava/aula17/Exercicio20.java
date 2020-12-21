package cursojava.aula17;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com a quantidade de alunos: ");
			int qtdAlunos = scan.nextInt();
			
			double media, soma=0;
			int idade;
			for(int i=0; i<qtdAlunos; i++) {
				System.out.println("Idade do aluno " + (i+1) + ": ");
				idade = scan.nextInt();
				
				soma += idade;
			}
			media = soma/qtdAlunos;
			
			if(media >= 0 && media <=25 ) {
				System.out.println("Jovem");
			}else if(media >= 26 && media <=60) {
				System.out.println("Adulta");
			}else if(media > 60) {
				System.out.println("Idosa");
			}else {
				System.out.println("Idade não válida");
			}
			
		}
	}
}
