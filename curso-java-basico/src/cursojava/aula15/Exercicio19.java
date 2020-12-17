package cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um número: ");
			double numero1 = scan.nextDouble();
			
			System.out.println("Entre com outro número: ");
			double numero2 = scan.nextDouble();
			
			double resultado;
			
			
			System.out.println("Deseja realizar qual operação? (1)Soma (2)Subtração (3)Multiplicação (4)Divisão ");
			int operacao = scan.nextInt();
			
			switch(operacao) {
				case 1:
					resultado = numero1+numero2;
					verificaNumero(resultado);
					break;
				case 2:
					resultado = numero1-numero2;
					verificaNumero(resultado);
					break;
				case 3:
					resultado = numero1*numero2;
					verificaNumero(resultado);
					break;
				case 4:
					resultado = numero1/numero2;
					verificaNumero(resultado);
					break;
				default:
					System.out.println("Entre com uma opção válida!");
			}
		}

	}
	
	public static void verificaNumero(double valor) {
		if(valor %2 == 0 ) {
			System.out.println("Número é par");
		}else {
			System.out.println("Número é impar");
		}
		
		if(valor >= 0) {
			System.out.println("Número é positivo");
		}else {
			System.out.println("Número é negativo");
		}
		
		System.out.println("Resultado: " + valor);
	}

}
