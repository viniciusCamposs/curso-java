package cursojava.aula17;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Digite o valor de N: ");
			int serie = scan.nextInt();			
			double soma=0;
			
			System.out.print("H = 1");
			for(int i=1, j=1; i<=serie; i++, j+=2) {
				System.out.print(" + " + 1 + "/" + j + " ");
				soma += 1/j;
			}
			System.out.print("= " + (soma+1));
		}

	}

}
