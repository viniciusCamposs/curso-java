package cursojava.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o salário de um colaborador: ");
			double salario = scan.nextDouble();
			double salarioAjustado, percentual;
			
			if(salario > 0 && salario <=280) {
				salarioAjustado = salario + ((salario*20)/100);
				percentual = 20;
				imprimirDados(salario, percentual, salarioAjustado);
			}else if(salario > 280 && salario < 700) {
				salarioAjustado = salario + ((salario*15)/100);
				percentual = 15;
				imprimirDados(salario, percentual, salarioAjustado);
			}else if(salario > 700 && salario < 1500) {
				salarioAjustado = salario + ((salario*10)/100);
				percentual = 10;
				imprimirDados(salario, percentual, salarioAjustado);
			}else if(salario > 1500) {
				salarioAjustado = salario + ((salario*5)/100);
				percentual = 5;
				imprimirDados(salario, percentual, salarioAjustado);
			}
			
		}
	}
	
	public static void imprimirDados(double salario, double percentual, double salarioAjustado) {
		System.out.println("Salário antes do reajuste: " + salario + 
				   "\nPercentual de aumento aplicado: " + percentual + "%" + 
				   "\nValor do aumento: " + (salarioAjustado - salario) + 
				   "\nNovo salário: " + salarioAjustado);
	}

}
