package cursojava.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com a primeira nota: ");
			double nota1 = scan.nextDouble();
			
			System.out.println("Entre com a segunda nota: ");
			double nota2 = scan.nextDouble();
			
			double media = (nota1+nota2)/2;
			
			if(media >= 0 && media < 4 ) {
				System.out.println("REPROVADO");
			}else if(media >= 4 && media < 6) {
				System.out.println("REPROVADO");
			}else if(media >= 6 && media < 7.5) {
				System.out.println("APROVADO");
			}else if(media >= 7.5 && media < 9) {
				System.out.println("APROVADO");
			}else if(media >= 9 && media <= 10) {
				System.out.println("APROVADO");
			}else {
				System.out.println("Einsten");
			}
		}

	}

}
