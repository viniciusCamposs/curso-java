package cursojava.aula16;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int i = 1;
			int max = 15;
			
			System.out.println("Contando até: " + max);
			
			while(i<=max) {
				System.out.println("Valor de i: " + i);
				i++;
			}
			
			i--;
			
			do {
				i++;
				System.out.println("Valor de i: " + i);
			}while(i < 15);
		}

	}

}
