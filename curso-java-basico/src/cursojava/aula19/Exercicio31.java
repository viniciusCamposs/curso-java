package cursojava.aula19;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[20];
			
			int[] vetorB = new int[vetorA.length];
			int countPar=0, countImpar=0;
			System.out.println("-=-=-=-=-=-= Entrada de Dados -=-=-=-=-=-=");
			for(int i=0; i<vetorA.length; i++) {
				System.out.printf("Posição %d: ", i);
				vetorA[i] = scan.nextInt();
				
				if(vetorA[i] %2 == 0) {
					countPar++;
				}else {
					countImpar++;
				}
			}
			
			int contPar = 0, contImpar = 0;
			for(int i=0; i<20; i++) {
				if(vetorA[i] %2 == 0) {
					vetorB[contPar] = vetorA[i];
					contPar++;
				}
			}
			
			for(int i=0; i<20; i++) {
				if(vetorA[i] %2 != 0) {
					vetorB[contImpar+contPar] = vetorA[i];
					contImpar++;
				}
			}
			
			System.out.println("-=-=-=-=-=-= Saída de Dados -=-=-=-=-=-=");
			
			System.out.println("-=-=-=-= Vetor A -=-=-=-=");
			for(int i=0; i<vetorA.length; i++) {
				System.out.println((i+1) + ") " + vetorA[i]);
			}
			
			System.out.println("-=-=-=-= Vetor B -=-=-=-=");
			for(int i=0; i<vetorB.length; i++) {
				System.out.println((i+1) + ") " + vetorB[i]);
			}
			
		}

	}

}
