package cursojava.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite uma letra: ");
			String letra = scan.next();
			
			switch(letra) {
				case "A":
				case "E":
				case "I":
				case "O":
				case "U":
					System.out.println("Vogal");
					break;
				default:
					System.out.println("Consoante!");
			}
		}

	}

}
