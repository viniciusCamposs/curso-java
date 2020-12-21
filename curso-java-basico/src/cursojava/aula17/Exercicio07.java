package cursojava.aula17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int count = 1;
		double maior = 0;
		try(Scanner scan = new Scanner(System.in)){
			while(count <= 5) {
				System.out.println("Número " + count + " :");
				double numero = scan.nextDouble();
				
				if(numero > maior) {
					maior = numero;
				}
				count++;
			}
			System.out.println("O maior número digitado foi: " + maior);
		}

	}
	

}
