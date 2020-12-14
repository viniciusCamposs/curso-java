package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio11 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um número inteiro: ");
			int inteiro1 = scan.nextInt();
			System.out.println("Entre com outro número inteiro: ");
			int inteiro2 = scan.nextInt();
			System.out.println("Entre com um número real: ");
			double real = scan.nextDouble();
			
			double resultadoA = ((inteiro1*2) * (inteiro2/2));
			double resultadoB = ((inteiro1*3)+real);
			double resultadoC = Math.pow(real, 3);
			
			System.out.println("Resultado A: " + resultadoA + 
							   "\nResultado B: " + resultadoB);
			arredondar(resultadoC);
		}
	}
	
	public static void arredondar(double valor) {
		System.out.println("Resultado C: " + new DecimalFormat("#,##0.00").format(valor));
	}

}
