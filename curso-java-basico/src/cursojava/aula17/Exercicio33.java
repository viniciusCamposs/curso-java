package cursojava.aula17;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Digite o valor de N: ");
			int serie = scan.nextInt();			
			double soma=0;
			
			System.out.print("S =");
			for(int i=1, j=1; i<=serie; i++, j+=2) {
				System.out.print(" + " + i + "/" + j + " ");
				soma += i/j;
			}
			System.out.print("= " + soma);
			
			
		}

	}

}
