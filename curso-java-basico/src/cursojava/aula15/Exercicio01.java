package cursojava.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("N�mero 1: ");
			double numero1 = scan.nextDouble();
			
			System.out.println("N�mero 2: ");
			double numero2 = scan.nextDouble();
			
			if(numero1 > numero2) {
				System.out.println("N�mero 1 � maior!");
			}else if(numero2 > numero1) {
				System.out.println("N�mero 2 � maior!");
			}else{
				System.out.println("Os dois n�meros s�o iguais!");
			}
			
		}

	}

}
