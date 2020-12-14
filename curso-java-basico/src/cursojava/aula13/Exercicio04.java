package cursojava.aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com as 4 notas do aluno: ");
			double nota1 = scan.nextDouble();
			double nota2 = scan.nextDouble();
			double nota3 = scan.nextDouble();
			double nota4 = scan.nextDouble();
			
			double media = (nota1+nota2+nota3+nota4)/4;
			
			System.out.println("\nA média deste aluno é: " + media);
		}
		
	}

}
