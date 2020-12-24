package cursojava.aula19;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[10];
			char[] vetorB = new char[10];
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= Posição " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: ");
				vetorA[i] = scan.nextInt();
			}
			
			for(int i=0; i<10; i++) {
				if(vetorA[i] < 7) {
					vetorB[i] = 'a';
				}
				
				if(vetorA[i] == 7) {
					vetorB[i] = 'b';
				}
				
				if(vetorA[i] > 7 && vetorA[i]<10) {
					vetorB[i] = 'c';
				}
				
				if(vetorA[i] == 10) {
					vetorB[i] = 'd';
				}
				
				if(vetorA[i] > 10) {
					vetorB[i] = 'e';
				}
			}
			
			
			for(int i=0; i<10; i++) {
				System.out.println("-=-=-=-=-=-= " + i + " -=-=-=-=-=-=");
				System.out.println("Valor de A: " + vetorA[i]);
				System.out.println("Valor de B: " + vetorB[i]);
				
			}
		}

	}

}
