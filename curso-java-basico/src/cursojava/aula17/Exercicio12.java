package cursojava.aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um número: ");
			int numero = scan.nextInt();
			
			for(int i=1; i<=10; i++) {
				if(i==1) {
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-= Tabuada de " + numero + " -=-=-=-=-=-=-=-=-=-=-=-=");
				}
				System.out.println(numero + " X " + i + " = " + (numero*i));
			}
		}

	}

}
