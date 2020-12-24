package cursojava.aula19;

import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];

			int countMaior35=0;
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("Idade da pessoa %d: ", i);
				a[i] = scan.nextInt();
				
				if(a[i]>35) {
					countMaior35++;
				}
				
				if(i==9) {
					System.out.println("\nQuantidade de pessoas que possuem idade superior a 35 anos: " + countMaior35);
				}
			}
		}
	}
}
