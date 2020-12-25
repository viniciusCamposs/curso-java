package cursojava.aula19;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] vetorA = new int[5];
			
			System.out.println("-=-=-=-=-=-= Entrada dos dados -=-=-=-=-=-=");
			for(int i=0; i<vetorA.length; i++) {
				System.out.printf("\nNúmero %d: ", i);
				vetorA[i] = scan.nextInt();
				
				System.out.println("-=-=-=-= Tabuada deste número -=-=-=-=");
				for(int j=1; j<=10; j++) {
					System.out.println(vetorA[i] + " X " + j + " = " + (vetorA[i]*j));
				}
			}
			
			System.out.println("-=-=-=-=-=-= Fim do programa -=-=-=-=-=-=");
			
			
			
		}

	}

}
