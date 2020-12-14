package cursojava.aula13;

import java.util.Scanner;


public class Exercicio14 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Peso: ");
			double peso = scan.nextDouble();
			double multa=0, qtdExcedente=0;
			if(peso > 50) {
				qtdExcedente = peso - 50;
				multa = qtdExcedente * 4;
			}
			
			System.out.println("Kgs: " + peso +
							   "\nQuantidade Excedente: " + qtdExcedente + 
							   "\nMulta: R$" + multa);
		}
	}
	
}
