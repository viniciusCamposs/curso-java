package cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Número 1: ");
			double numero1 = scan.nextDouble();
			
			System.out.println("Número 2: ");
			double numero2 = scan.nextDouble();
			
			if(numero1 > numero2) {
				System.out.println("Número 1 é maior!");
			}else if(numero2 > numero1) {
				System.out.println("Número 2 é maior!");
			}else{
				System.out.println("Os dois números são iguais!");
			}
			
		}

	}

}
