package cursojava.aula19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];

			int  countPares=0, countImpares=0;
			double porcentagemImpares, porcentagemPares;
			
			System.out.println("-=-=-=-=-=-=-=-= ENTRADA DE DADOS -=-=-=-=-=-=-=-=");
			for(int i=0; i<a.length; i++) {
				System.out.printf("Elemento %d: ", i);
				a[i] = scan.nextInt();
				
				if(a[i] %2 !=0) {
					countImpares++;
				}
				
				
				if(a[i] %2 ==0) {
					countPares++;
				}
				
				if(i==9) {
					porcentagemImpares = (countImpares*100)/a.length;
					porcentagemPares = (countPares*100)/a.length;
					System.out.printf("\nQuantidade de números armazenados: " + a.length + 
									  "\nPorcentagem dos números ímpares: " + porcentagemImpares + 
									  "\nPorcentagem dos números pares: " + porcentagemPares);
				}

			}
		}

	}

}
