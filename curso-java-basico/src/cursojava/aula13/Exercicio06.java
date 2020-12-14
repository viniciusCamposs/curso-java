package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio06 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o raio do círculo: ");
			double raio = scan.nextDouble();
			
			double pi = Math.PI;
			double area = pi * (raio*raio);

			arredondar(area);
		}
		
	}
	
	public static void arredondar(double valor) {
		System.out.println(new DecimalFormat("#,##0.00").format(valor));
	}

}
