package cursojava.aula19;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];
			
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("Elemento %d: ", i);
				a[i] = scan.nextInt();
			}
			
			System.out.println("\n-=-=-=-=-=-=-=-= SAÍDA DE DADOS -=-=-=-=-=-=-=-=");
			int count=0;
			for(int i=0; i<10; i++) {
				if(a[i] %2 ==0) {
					count++;
				}
				if(i==9) {
					System.out.printf("%d dos números digitados são pares.", count);
				}
			}
			
			System.out.println("\n\n-=-=-=-=-=-=-=-= FIM DO PROGRAMA -=-=-=-=-=-=-=-=");
			
		}

	}

}
