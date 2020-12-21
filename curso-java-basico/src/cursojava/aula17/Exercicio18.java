package cursojava.aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Número inteiro: ");
			int inteiro = scan.nextInt();
			
			System.out.println(ehPrimo(inteiro));
		}

	}
	
	private static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}

}
