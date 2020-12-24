package cursojava.aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];

			int maior=0, menor=0, posicaoMaior=1, posicaoMenor=1;
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("Idade da pessoa %d: ", i);
				a[i] = scan.nextInt();

				if(i==0) {
					maior = a[i];
					menor = a[i];
				}
				
				if(a[i]>maior) {
					maior = a[i];
					posicaoMaior = i;
				}
				
				if(a[i]<menor) {
					menor = a[i];
					posicaoMenor = i;
				}
				
				
				if(i==9) {
					System.out.println("\nMaior: " + maior + 
									   "\nMenor: " + menor + 
									   "\nPosição maior: " + posicaoMaior + 
									   "\nPosição menor: " + posicaoMenor);
				}
			}
		}

	}

}
