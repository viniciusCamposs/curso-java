package cursojava.aula19;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			int[] vetorB = new int[10];
			int[] vetorC = new int[10];
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: ");
				vetorA[i] = scan.nextInt();
				
				System.out.println("Valor de B: ");
				vetorB[i] = scan.nextInt();
				
			}
			
			for(int i=0; i<10; i++) {
				if(vetorA[i] > vetorB[i]) {
					vetorC[i] = 1;
				}
				
				if(vetorA[i] == vetorB[i]) {
					vetorC[i] = 0;
				}
				
				if(vetorA[i] < vetorB[i]) {
					vetorC[i] = -1;
				}
			}
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: " + vetorA[i]);
				System.out.println("Valor de B: " + vetorB[i]);
				System.out.println("Valor de C: " + vetorC[i]);
			}
			
			
			
		}

	}

}
