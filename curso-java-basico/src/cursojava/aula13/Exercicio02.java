package cursojava.aula13;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um n�mero: ");
			int numero = scan.nextInt();
			System.out.println("\nO n�mero que voc� digito foi: " + numero);
		}

	}

}
