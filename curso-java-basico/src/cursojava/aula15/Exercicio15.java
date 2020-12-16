package cursojava.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com o primeiro lado: ");
			double lado1 = scan.nextDouble();
			
			System.out.println("Entre com o segundo lado: ");
			double lado2 = scan.nextDouble();

			System.out.println("Entre com o terceiro lado: ");
			double lado3 = scan.nextDouble();
			

			if((lado1+lado2) > lado3 || (lado2+lado3) > lado3 || (lado1+lado3) > lado2){
				if(lado1 == lado2 && lado2 == lado3) {
					System.out.println("Tri�ngulo Equil�tero");
				}else if(lado1 == lado2 || lado1==lado3 || lado2==lado3) {
					System.out.println("Tri�ngulo Is�sceles");
				}else if(lado1 != lado2 && lado2 != lado3) {
					System.out.println("Tri�ngulo Escaleno");
				}
			}else {
				System.out.println("Os valores n�o formam um tri�ngulo!");
			}
			

		}

	}

}
