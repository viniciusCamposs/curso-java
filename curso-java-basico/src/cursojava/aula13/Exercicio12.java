package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio12 {
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com a sua altura: ");
			double altura = scan.nextDouble();
			
			double pesoIdeal = (72.7 * altura) - 58;
			
			arredondar(pesoIdeal);
		}
	}
	
	public static void arredondar(double valor) {
		System.out.println("Peso ideal: " + new DecimalFormat("#,##0.00").format(valor));
	}
}
