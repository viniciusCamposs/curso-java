package cursojava.aula19;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int[] a = new int[10];
			
			System.out.println("-=-=-=-=-=-= Leitura dos dados -=-=-=-=-=-=");
			for(int i=0; i<10; i++) {
				System.out.printf("\nValor %d: ", (i+1));
				a[i] = scan.nextInt();
			}
			System.out.println("-=-=-=-=-=-= Verificando os dados -=-=-=-=-=-=");
			boolean palindromo=true;
			for(int i=0; i<10; i++) {
				if(a[i] != a[a.length -1 - i]) {
					palindromo = false;
					break;
				}
			}
			
			System.out.println("É palindromo? " + palindromo);
			
			System.out.println("-=-=-=-=-=-= Fim do programa -=-=-=-=-=-=");
		}

	}

}
