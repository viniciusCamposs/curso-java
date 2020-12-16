package cursojava.aula15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um ano: ");
			int ano = scan.nextInt();
			
			if(((ano %4 == 0) && (ano %100 != 0)) || (ano %400 == 0)) {
				System.out.println("Ano é bissexto!");
			}else {
				System.out.println("Ano não é bissexto!");
			}
		}

	}

}
