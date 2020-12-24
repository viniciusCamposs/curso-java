package cursojava.aula19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];

			int soma =0;
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("Elemento %d: ", i);
				a[i] = scan.nextInt();
				if(a[i] %5==0) {
					soma += a[i];
				}
				
				if(i==9) {
					System.out.printf("\nA soma é: %d", soma);
				}
			}
		}

	}

}
