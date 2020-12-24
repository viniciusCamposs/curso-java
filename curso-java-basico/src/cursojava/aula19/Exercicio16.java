package cursojava.aula19;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];
			int soma=0, media=0, countIgual15=0, countMaior15=0, somaMaior15=0;
			
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("Elemento %d: ", i);
				a[i] = scan.nextInt();
				
				if(a[i] < 15) {
					soma += a[i];
				}
				
				if(a[i] == 15) {
					countIgual15++;
				}
				
				if(a[i] > 15) {
					somaMaior15 += a[i];
					countMaior15++;
				}
				
				
				if(i==9) {
					media = somaMaior15/countMaior15;
					System.out.println("\nA soma dos elementos que são inferiores a 15: " + soma + 
									   "\nA quantidade de elementos que são iguais a 15: " + countIgual15 + 
									   "\nA média dos elementos que são superiores a 15: " + media);
				}
			}

			System.out.println("\n-=-=-=-=-=-=-=-= FIM DO PROGRAMA -=-=-=-=-=-=-=-=");
			
		}

	}

}
