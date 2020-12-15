package cursojava.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			double valor = scan.nextDouble();
			
			if(valor > 0) {
				System.out.println("Número positivo");
			}else if(valor < 0) {
				System.out.println("Número negativo");
			}else {
				System.out.println("Número nulo");
			}
		}

	}

}
