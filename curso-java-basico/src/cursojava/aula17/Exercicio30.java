package cursojava.aula17;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("-=-=-=-=-=-= TABUADA PERSONALIZADA -=-=-=-=-=-=");
			System.out.println("Tabuada do: ");
			int numeroEscolhido = scan.nextInt();
			
			System.out.println("Começar por: ");
			int numeroInicial = scan.nextInt();
			
			System.out.println("Terminar em: ");
			int numeroFinal = scan.nextInt();
			
			
			for(int i=numeroInicial; i<=numeroFinal; i++) {
				System.out.println(numeroEscolhido +  " X " + i + " = " + (numeroEscolhido*i));
			}
			
		}
	}
}
