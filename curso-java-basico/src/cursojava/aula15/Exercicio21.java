package cursojava.aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Litros vendidos: ");
			double litros = scan.nextDouble();
			
			System.out.println("Tipo de combústivel (A)-Álcool (G)-Gasolina: ");
			String combustivel = scan.next();
			
			double precoPago, desconto;
			
			if(combustivel.equals("A")) {
				if(litros > 0 && litros <= 20) {
					precoPago = 1.90 * litros;
					desconto = (precoPago*3)/100;
					precoPago -= desconto;
					System.out.println("Preço normal: " + (precoPago+desconto) + 
							   		   "\nDesconto 3%: " + desconto + 
							           "\nPreço com desconto: " + precoPago);
				}else {
					precoPago = 1.90 * litros;
					desconto = (precoPago*5)/100;
					precoPago -= desconto;
					System.out.println("Preço normal: " + (precoPago+desconto) + 
							           "\nDesconto 5%: " + desconto + 
							           "\nPreço com desconto: " + precoPago);
				}
			}else if(combustivel.equals("G")) {
				if(litros > 0 && litros <= 20) {
					precoPago = 2.50 * litros;
					desconto = (precoPago*4)/100;
					precoPago -= desconto;
					System.out.println("Preço normal: " + (precoPago+desconto) + 
									   "\nDesconto 4%: " + desconto + 
									   "\nPreço com desconto: " + precoPago);	
				}else {
					precoPago = 2.50 * litros;
					desconto = (precoPago*6)/100;
					precoPago -= desconto;
					System.out.println("Preço normal: " + (precoPago+desconto) + 
							           "\nDesconto 6%: " + desconto + 
							           "\nPreço com desconto: " + precoPago);
				}
			}else {
				System.out.println("Entre com uma opção válida!");
			}
			
		}

	}

}
