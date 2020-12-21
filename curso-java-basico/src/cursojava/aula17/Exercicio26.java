package cursojava.aula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Número: ");
			int numero = scan.nextInt();
			
			System.out.printf("Fatorial de: %d", numero);
			fatorial(numero);
		}

	}
	
	public static void fatorial(int numero) {
		int fatorial = numero;
		int resultado=numero;
		System.out.printf("\n%d! = ", numero);
		while(fatorial>1) {
			System.out.print(fatorial + " . ");
			resultado = (resultado * (fatorial-1));
			fatorial--;
			if(fatorial==1) {
				System.out.print("1 = " + resultado);
			}
		}
	}

}
