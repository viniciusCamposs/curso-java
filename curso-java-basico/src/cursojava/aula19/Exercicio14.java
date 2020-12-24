package cursojava.aula19;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];

			int soma = 0, media =0, count=0;
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<a.length; i++) {
				System.out.printf("Elemento %d: ", i);
				a[i] = scan.nextInt();
				
				if(a[i] %2 !=0) {
					soma += a[i];
					count++;
				}
				
				if(i==9) {
					media = soma/count;
					System.out.printf("\nA media é: %d", media);
				}

			}
		}


	}

}
