package cursojava.aula15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o primeiro produto: ");
			double produto1 = scan.nextDouble();
			
			System.out.println("Digite o segundo produto: ");
			double produto2 = scan.nextDouble();
			
			System.out.println("Digite o terceiro produto: ");
			double produto3 = scan.nextDouble();
			
			if(produto1 < produto2 && produto1 < produto3) {
				System.out.println("Você deve comprar o produto 01");
			}else if(produto2 < produto1 && produto2 < produto3) {
				System.out.println("Você deve comprar o produto 02");
			}else if(produto3 < produto1 && produto3 < produto1) {
				System.out.println("Você deve comprar o produto 03");
			}else if(produto3 < produto1 && produto3 < produto1){
				System.out.println("Os valores dos produtos são iguais.");
			}
		}


	}

}
