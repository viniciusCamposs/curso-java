package cursojava.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero: ");
			double numero1 = scan.nextDouble();
			
			System.out.println("Digite o segundo numero: ");
			double numero2 = scan.nextDouble();
			
			System.out.println("Digite o terceiro numero: ");
			double numero3 = scan.nextDouble();

			
			if(numero1 > numero2 && numero1 > numero3) {
				System.out.println("Número 1 é o maior dos números digitados");
			}else if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("Número 2 é o maior dos números digitados");
			}else if(numero3 > numero1 && numero3 > numero1) {
				System.out.println("Número 3 é o maior dos números digitados");
			}else {
				System.out.println("Os números são iguais");
			}
		}

	}

}
