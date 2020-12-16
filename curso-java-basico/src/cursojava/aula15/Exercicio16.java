package cursojava.aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com o valor de A: ");
			double a = scan.nextDouble();
			
			if(a==0) {
				System.out.println("Não é uma equação do segundo grau!");
			}else {
				System.out.println("Entre com o valor de B: ");
				double b = scan.nextDouble();
				
				System.out.println("Entre com o valor de C: ");
				double c = scan.nextDouble();

				double delta  = Math.pow(b, 2) - (4 * a * c);
				
				if(delta < 0 ) {
					System.out.println("A equação não possui raizes!");
				}else {
					if(delta == 0) {
						double x = ( b * -1 ) + Math.sqrt( delta ) / 2*a;
						System.out.println("O delta só possui uma raiz real, sendo ela: " + x);
					}else if(delta > 0) {
						 double x1 = ( b * -1 ) + Math.sqrt( delta ) / 2*a;
						 double x2 = ( b * -1 ) - Math.sqrt( delta ) / 2*a;
						 System.out.println("X1: " + x1 + "\nX2: " + x2);
					}
					}
				}
			}
			

		}

	}

