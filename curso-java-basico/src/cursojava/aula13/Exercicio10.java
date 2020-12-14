package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com a temperatura em Celsius: ");
			double celsius = scan.nextDouble();
			
			double farenheit = ((celsius/5)*9+32);
			
			arredondar(farenheit);
		}
		

	}
	
	public static void arredondar(double valor) {
		System.out.println("Temperatura em Farenheit: " + new DecimalFormat("#,##0.00").format(valor));
	}

}
