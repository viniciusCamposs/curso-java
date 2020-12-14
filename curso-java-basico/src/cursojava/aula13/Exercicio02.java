package cursojava.aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int numero = scan.nextInt();
			System.out.println("\nO número que você digito foi: " + numero);
		}

	}

}
