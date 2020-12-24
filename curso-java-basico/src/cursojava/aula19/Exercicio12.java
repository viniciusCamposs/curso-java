package cursojava.aula19;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];
			int soma=0;
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("Elemento %d: ", i);
				a[i] = scan.nextInt();
				soma += a[i];
				if(i==9) {
					System.out.printf("\nA soma é: %d", soma);
				}
			}

			System.out.println("\n\n-=-=-=-=-=-=-=-= FIM DO PROGRAMA -=-=-=-=-=-=-=-=");
			
		}

	}

}
