package cursojava.aula19;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[20];
			int contadorPares=0, contadorImpares=0;
			for(int i=0; i<20; i++) {
				System.out.println((i+1) + ") ");
				vetorA[i] = scan.nextInt();
				
				if(vetorA[i] %2 ==0) {
					contadorPares++;
				}else {
					contadorImpares++;
				}
			}
			
			int[] vetorB = new int[vetorA.length];
			int[] vetorC = new int[vetorA.length];
			int contB=0, contC=0;
			
			for(int i=0; i<20; i++) {
				if(vetorA[i] %2 == 0) {
					vetorB[contB] = vetorA[i];
					contB++;
				}else {
					vetorC[contC] = vetorA[i];
					contC++;
				}
			}
			
			for(int i=0; i<20; i++) {
				System.out.println(i + ") A: " + vetorA[i]);
			}
			
			for(int i=0; i<contB; i++) {
				System.out.println(i + ") B: " + vetorB[i]);
			}
			
			for(int i=0; i<contC; i++) {
				System.out.println(i + ") C: " + vetorC[i]);
			}
			
		}

	}

}
