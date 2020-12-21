package cursojava.aula17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Número 1: ");
			int numero1 = scan.nextInt();
			
			System.out.println("Número 2: ");
			int numero2 = scan.nextInt();
			
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=- INTERVALO =-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			for(int intervalo = numero1+1; intervalo<numero2; intervalo++) {
				System.out.print(" " + intervalo);
			}
		}

	}

}
