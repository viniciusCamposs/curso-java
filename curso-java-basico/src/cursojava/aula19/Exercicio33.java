package cursojava.aula19;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			
			System.out.println("-=-=-=-=-=-= Entrada dos Dados -=-=-=-=-=-=");
			for(int i=0; i<vetorA.length; i++) {
				System.out.println((i+1) + ") Posição: ");
				vetorA[i]= scan.nextInt();
			}
			
			System.out.println("-=-=-=-=-=-= Saida dos Dados -=-=-=-=-=-=");
			for(int i=0; i<vetorA.length; i++) {
				System.out.printf("Valor da posição %d: %d", (i+1), vetorA[i]);
				System.out.println("\nÉ primo? " + ehPrimo(vetorA[i]));
			}
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
