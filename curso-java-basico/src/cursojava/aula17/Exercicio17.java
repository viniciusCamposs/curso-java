package cursojava.aula17;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Número: ");
			int numero = scan.nextInt();
			fatorial(numero);

		}
	}
	
	public static void fatorial(int numero) {
		int fatorial = numero;
		int resultado=numero;
		while(fatorial>1) {
			resultado = (resultado * (fatorial-1));
			System.out.print(resultado + " ");
			fatorial--;
		}
	}

}
