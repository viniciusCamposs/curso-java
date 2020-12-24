package cursojava.aula19;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("-=-=-=-=-=-= Inicio do programa -=-=-=-=-=-=");
			int[] numeros = new int[10];
			
			for(int i=0; i<numeros.length; i++) {
				System.out.println("(somente pares) Número " + i + ": ");
				numeros[i] = scan.nextInt();
				if(numeros[i]%2!=0) {
					break;
				}
			}
			System.out.println("-=-=-=-=-=-= fim do programa -=-=-=-=-=-=");
		}

	}

}
