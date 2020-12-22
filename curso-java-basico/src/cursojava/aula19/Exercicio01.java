package cursojava.aula19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[5];
			int[] b = new int[5];
			
			System.out.println("-=-=-=-=-=-= A -=-=-=-=-=-=");
			for(int i=0; i<5; i++) {
				System.out.printf("[%d]: ", (i+1));
				a[i] = scan.nextInt();
			}
			
			/*System.out.println("-=-=-=-=-=-= B-01 -=-=-=-=-=-=");
			for(int b : a) {
				System.out.print(b + " ");
			}*/
			
			System.out.println("-=-=-=-=-=-= B-02 -=-=-=-=-=-=");
			for(int i=0; i<5; i++) {
				b[i] = a[i];
				System.out.print(b[i]+ " ");
			}
		}
		

	}

}
