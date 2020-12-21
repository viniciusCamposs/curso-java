package cursojava.aula17;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int numero, par=0, impar=0;
			for(int i=1; i<=10; i++) {
				System.out.println("Entre com um número: ");
				numero = scan.nextInt();
				
				if(numero %2 == 0) {
					par++;
				}else {
					impar++;
				}
				
			}
			System.out.println("Pares: " + par + 
							   "\nImpares: " + impar);
		}
	}
}
