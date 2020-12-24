package cursojava.aula19;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			double dollar = 5.00;
			double[] resultado = new double[20];
			double[] conversao = new double[20]; 
			
			System.out.println("-=-=-=-=-=-= CONVERSÃO DE DOLLAR PARA REAL -=-=-=-=-=-=");
			for(int i=0; i<resultado.length; i++) {
				System.out.println("Dollars: ");
				conversao[i] = scan.nextDouble();
				
				resultado[i] = conversao[i]*dollar;
			}
			System.out.println("-=-=-=-=-=-= REAL CONVERTIDO -=-=-=-=-=-=");
			for(int i=0; i<resultado.length; i++) {
				System.out.println(i + ")" + " Real: " + resultado[i]);
			}
		}

	}

}
