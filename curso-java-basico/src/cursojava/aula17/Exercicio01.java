package cursojava.aula17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um n�mero entre 0 e 10: ");
			double numero = scan.nextDouble();
			
			while(numero < 0 || numero > 10) {
				System.out.println("--------------- N�MERO INV�LIDO ---------------");
				System.out.println("Entre com um n�mero entre 0 e 10: ");
				numero = scan.nextDouble();
			}
			
			System.out.println("--------------- PROGRAMA FINALIZADO ---------------");
		}

	}

}
