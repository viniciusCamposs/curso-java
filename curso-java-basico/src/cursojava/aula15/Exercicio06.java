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
				System.out.println("N�mero 1 � o maior dos n�meros digitados");
			}else if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("N�mero 2 � o maior dos n�meros digitados");
			}else if(numero3 > numero1 && numero3 > numero1) {
				System.out.println("N�mero 3 � o maior dos n�meros digitados");
			}else {
				System.out.println("Os n�meros s�o iguais");
			}
		}

	}

}
