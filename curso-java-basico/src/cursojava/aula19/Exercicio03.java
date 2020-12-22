package cursojava.aula19;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[15];
			int[] b = new int[15];
			
			System.out.println("-=-=-=-=-=-= A -=-=-=-=-=-=");
			for(int i=0; i<15; i++) {
				System.out.printf("[%d]: ", (i+1));
				a[i] = scan.nextInt();
			}
			
			System.out.println("-=-=-=-=-=-= B -=-=-=-=-=-=");
			for(int i=0; i<15; i++) {
				b[i] = a[i]*a[i];
				System.out.print(b[i]+ " ");
			}
		}
	}

}


