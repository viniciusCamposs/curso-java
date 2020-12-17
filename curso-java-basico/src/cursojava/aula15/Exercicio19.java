package cursojava.aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com um n�mero: ");
			double numero1 = scan.nextDouble();
			
			System.out.println("Entre com outro n�mero: ");
			double numero2 = scan.nextDouble();
			
			double resultado;
			
			
			System.out.println("Deseja realizar qual opera��o? (1)Soma (2)Subtra��o (3)Multiplica��o (4)Divis�o ");
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
					System.out.println("Entre com uma op��o v�lida!");
			}
		}

	}
	
	public static void verificaNumero(double valor) {
		if(valor %2 == 0 ) {
			System.out.println("N�mero � par");
		}else {
			System.out.println("N�mero � impar");
		}
		
		if(valor >= 0) {
			System.out.println("N�mero � positivo");
		}else {
			System.out.println("N�mero � negativo");
		}
		
		System.out.println("Resultado: " + valor);
	}

}
