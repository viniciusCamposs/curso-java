package cursojava.aula13;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class Exercicio09 {
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com a temperatura em Farenheit: ");
			double farenheit = scan.nextDouble();
			
			double celsius = (5 * (farenheit-32) / 9);
			
			arredondar(celsius);
			
			
		}
	}
	
	public static void arredondar(double valor) {
		System.out.println("Temperatura Celsius: " + new DecimalFormat("#,##0.00").format(valor));
	}
	
}
