package cursojava.aula13;

import java.util.Scanner;


public class Exercicio07 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Lado 1: ");
			double lado1 = scan.nextDouble();
					
			double area = Math.pow(lado1, 2);
			
			System.out.println("A �rea do quadrado �: " + area +
							   "\nO dobro dessa �rea �: " + (area*2));
		}

	}

}
