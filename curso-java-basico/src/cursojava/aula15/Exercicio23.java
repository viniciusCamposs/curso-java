package cursojava.aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Tipo da carne: (F) File Duplo (A) Alcatra P (Picanha): ");
			String tipo = scan.next();
			
			System.out.println("Quantidade de carne comprada: ");
			double quantidade = scan.nextDouble();
			
			System.out.println("Vai pagar com o cartão do mercado? (S) Sim (N) Não: ");
			String formaPagamento = scan.next();
			
			calcular(tipo, quantidade, formaPagamento);
		}
	}
	
	public static void calcular(String tipo ,double quantidade, String formaPagamento) {
		double preco;
		if(tipo.equals(tipo)) {
			if(quantidade > 0 && quantidade <= 5) {
				preco = verificaTabela(tipo, quantidade) * quantidade;
				
				preco = formaPagamento(formaPagamento, preco);
				
				imprimeDados(preco, tipo, quantidade);

			}else if(quantidade > 5) {
				preco = verificaTabela(tipo, quantidade) * quantidade;
				
				preco = formaPagamento(formaPagamento, preco);
				
				imprimeDados(preco, tipo, quantidade);
			}
		}
		
	}
	
	public static double formaPagamento(String formaPagamento, double preco) {
		if(formaPagamento.equals("S")) {
			return preco -= (preco*5)/100;
		}else {
			return preco;
		}
	}
	
	public static double verificaTabela(String tipo, double quantidade) {
		if(tipo.equals("F")) {
			if(quantidade > 0 && quantidade <= 5) {
				return 4.90;
			}else if(quantidade > 5) {
				return 5.80;
			}
		}else if(tipo.equals("A")) {
			if(quantidade > 0 && quantidade <= 5) {
				return 5.90;
			}else if(quantidade > 5) {
				return 6.80;
			}
		}else if(tipo.equals("P")) {
			if(quantidade > 0 && quantidade <= 5) {
				return 6.90;
			}else if(quantidade > 5) {
				return 7.80;
			}
		}
		
		return -1;
	}
	
	public static void imprimeDados(double preco, String tipo, double quantidade) {
		System.out.println("Tipo da carne: " + tipo + 
						   "\nQuantidade de carne: " + quantidade + 
						   "\nPreço a pagar: " + preco);
	}

}
