package cursojava.aula15;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com o valor pago por hora: ");
			double valorHora = scan.nextDouble();
			
			System.out.println("Entre com o número de horas trabalhadas: ");
			double horasTrabalhadas = scan.nextDouble();
			
			double salarioBruto = valorHora * horasTrabalhadas;
			double ir;
			
			if(salarioBruto > 900 && salarioBruto <= 1500) {
				calculaImprimeDados(salarioBruto, 5);
			}else if(salarioBruto > 1500 && salarioBruto <= 2500) {
				calculaImprimeDados(salarioBruto, 10);
			}else if(salarioBruto > 2500) {
				calculaImprimeDados(salarioBruto, 20);
			}else {
				System.out.println("Entre com um salário válido!!");
			}
		}
	}
	
	
	public static void calculaImprimeDados(double salarioBruto, double percentual) {
		double sindicato = (salarioBruto*3)/100;
		double fgts = (salarioBruto*11)/100;
		double salarioLiquido = (salarioBruto - ((salarioBruto*percentual)/100)) - sindicato;
		
		System.out.println("Salário bruto: R$" + salarioBruto + 
				   		   "\n(-) Imposto de renda: R$" + (salarioBruto*percentual)/100 + 
				   		   "\n(-) Sindicato: R$" + sindicato + 
				   		   "\nFGTS: R$" + fgts + 
				   		   "\nTotal de descontos: " + (((salarioBruto*percentual)/100)+sindicato) +
				   		   "\nSalário Liquido: R$" + salarioLiquido);
		
	}
	
}
