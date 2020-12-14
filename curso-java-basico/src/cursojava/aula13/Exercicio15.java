package cursojava.aula13;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Quanto você ganha por hora? ");
			double salarioHora = scan.nextDouble();
			
			System.out.println("Quantas horas você trabalha por mês? ");
			double horasTrabalhadas = scan.nextDouble();
			
			double salario = horasTrabalhadas * salarioHora;
			
			double inss = (salario*8)/100;
			double sindicato = (salario*5)/100;
			double impostoDeRenda = (salario*11)/100;
			double salarioLiquido = (((salario - impostoDeRenda)-inss)-sindicato);
			
			System.out.println("Salário bruto: " + salario);
			System.out.println("\nInss: " + inss);
			System.out.println("\nSindicato: " + sindicato);
			System.out.println("\nImposto de Renda: " + impostoDeRenda);
			System.out.println("\nSalário liquido: " + salarioLiquido);
		}
	}

}
