package cursojava.aula17;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		int op = 1;
		try(Scanner scan = new Scanner(System.in)){
			while(op==1) {
				System.out.println("Quantidade de produtos: ");
				int qtdProdutos = scan.nextInt();
				
				double valorProduto, soma=0;
				
				for(int i=0; i<qtdProdutos; i++) {
					System.out.printf("Preço do produto %d: ", (i+1));
					valorProduto = scan.nextDouble();
					soma += valorProduto;
				}
				
				
				System.out.println("Valor em dinheiro que o cliente forneceu: ");
				double dinheiroCliente = scan.nextDouble();
				
				System.out.println("Total: " + soma + 
								   "\nDinheiro: " + dinheiroCliente +
								   "\nTroco: " + (dinheiroCliente-soma));
				
				System.out.println("\n\nDeseja continuar? (1) Sim / (0) Não: ");
				op = scan.nextInt();
			}
			System.out.println("-=-=-=-=-=-=-=-=-= FIM DO PROGRAMA -=-=-=-=-=-=-=-=-=");
		}
	}

}
