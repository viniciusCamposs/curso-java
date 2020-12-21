package cursojava.aula17;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Quantidade de CDs: ");
			int quantidadeCds = scan.nextInt();
			
			System.out.println("Valor de cada CD: ");
			double valorCd = scan.nextDouble();
			
			double valorTotal = valorCd * quantidadeCds;
			
			double media = valorTotal/quantidadeCds;
			
			System.out.println("Valor total: " + valorTotal + 
							   "\nMédia: " + media);	
		}
	}
}
