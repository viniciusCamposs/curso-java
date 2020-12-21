package cursojava.aula17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Quantidade de notas: ");
			int notas = scan.nextInt();
			
			double nota, soma=0, media;
			for(int i=0; i<notas; i++) {
				System.out.println("Nota " + (i+1) + ": ");
				nota = scan.nextDouble();
				soma += nota;
			
			}
			media = soma/notas;
			System.out.println("Média: " + media);
		}


	}

}
