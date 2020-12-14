package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio08 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Quanto você ganha por hora? ");
			double valorHora = scan.nextDouble();
			
			System.out.println("Quantas horas você trabalha por mês? ");
			double horasMes = scan.nextDouble();
			
			double salario = valorHora*horasMes;
			
			arrendondar(salario);
		}

	}
	
	public static void arrendondar(double valor){
		System.out.println("Salário: " + new DecimalFormat("#,##0.00").format(valor));
	}

}
