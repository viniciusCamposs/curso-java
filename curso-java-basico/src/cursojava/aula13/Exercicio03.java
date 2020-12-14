package cursojava.aula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args){
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite dois números: ");
			int numero1 = scan.nextInt();
			int numero2 = scan.nextInt();
			System.out.println("A soma desses números é: " + (numero1+numero2));
		}
		
	}
	
}
