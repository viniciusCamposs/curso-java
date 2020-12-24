package cursojava.aula19;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			int[] vetorB = new int[10];
			int[] vetorC = new int[20];
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: ");
				vetorA[i] = scan.nextInt();
				
				System.out.println("Valor de B: ");
				vetorB[i] = scan.nextInt();
			}
			
			
			for(int i=0; i<20; i++) {
				if(i<10) {
					vetorC[i] = vetorA[i];
				}else {
					vetorC[i] = vetorB[i-10];
				}
			}
			
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: " + vetorA[i]);
				System.out.println("Valor de B: " + vetorB[i]);
				System.out.println("Valor de C: " + vetorC[i]);
				if(i==9) {
					for(int j=10; j<20; j++) {
						System.out.println("Valor de C: " + vetorC[j]);
					}
				}
				
			}
		}

	}

}
