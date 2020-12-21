package cursojava.aula17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int op=1;
			while(op==1) {
				System.out.println("Código do item pedido: ");
				int codigo = scan.nextInt();
				
				System.out.println("Quantidade: ");
				int qtd = scan.nextInt();
				
				calculaImprimeDados(codigo, qtd);
				
				
				System.out.println("Deseja sair? (1)Não / (2) Sim: ");
				op = scan.nextInt();
			}
			
			System.out.println("-=-=-=-=-=-= FIM DO PROGRAMA -=-=-=-=-=-=");
			
		}

	}
	
	public static void calculaImprimeDados(int codigo, int qtd) {
		double preco;
		
		switch(codigo) {
			case 100:
				preco = 1.20 * qtd;
				System.out.println("Preço a pagar: " + preco);
				break;
			case 101:
				preco = 1.30 * qtd;
				System.out.println("Preço a pagar: " + preco);
				break;
			case 102:
				preco = 1.50 * qtd;
				System.out.println("Preço a pagar: " + preco);
				break;
			case 103:
				preco = 1.20 * qtd;
				System.out.println("Preço a pagar: " + preco);
				break;
			case 104:
				preco = 1.30 * qtd;
				System.out.println("Preço a pagar: " + preco);
				break;
			case 105:
				preco = 1.00 * qtd;
				System.out.println("Preço a pagar: " + preco);
				break;	
		}
		
		
	}

}
