package cursojava.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um n�mero: ");
			int numero = scan.nextInt();
			
			if(numero %2 == 0) {
				System.out.println("N�mero � par!");
			}else {
				System.out.println("N�mero n�o � par!");
			}
		}
	}
}
