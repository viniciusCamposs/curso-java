package cursojava.aula19;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];
			int[] b = new int[10];
			
			System.out.println("-=-=-=-=-=-= A -=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("[%d]: ", (i+1));
				a[i] = scan.nextInt();
			}
			
			System.out.println("-=-=-=-=-=-= B -=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				b[i] = a[i]%2;
				System.out.print(b[i]+ " ");
			}
		}
	}

}
