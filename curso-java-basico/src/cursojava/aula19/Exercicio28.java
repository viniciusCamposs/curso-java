package cursojava.aula19;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			int[] vetorB = new int[10];
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: ");
				vetorA[i] = scan.nextInt();
			}
			
			
			for(int i=0; i<10; i++) {
				vetorB[vetorB.length -1 - i] = vetorA[i];
			}
			
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: " + vetorA[i]);
				System.out.println("Valor de B: " + vetorB[i]);
			}
			
			
		}

	}

}
