package cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int op=1;
		try(Scanner scan = new Scanner(System.in)){
			while(op==1) {
				System.out.println("-=-=--=-=--=-=--=-=- País A -=-=--=-=--=-=--=-=-");
				System.out.println("Entre com o número de habitantes: ");
				double pais1Habitantes = scan.nextDouble();
				
				System.out.println("Taxa de crescimento: ");
				double pais1Taxa = scan.nextDouble();
				
				System.out.println("-=-=--=-=--=-=--=-=- País B -=-=--=-=--=-=--=-=-");
				System.out.println("Entre com o número de habitantes: ");
				double pais2Habitantes = scan.nextDouble();
				
				System.out.println("Taxa de crescimento: ");
				double pais2Taxa = scan.nextDouble();
				
				int count = 0;
				
				if(pais1Habitantes >= pais2Habitantes) {
					System.out.println("País A já possui um número igual ou maior de habitantes que o país B");
				}else {
					while(pais2Habitantes > pais1Habitantes) {
						pais1Habitantes += ((pais1Habitantes*pais1Taxa)/100);
						
						pais2Habitantes += ((pais2Habitantes*pais2Taxa)/100);
						
						count++;
					}
					System.out.println("Número de anos necessários: " + count);
				}
				
				System.out.println("Deseja continuar? (1) Sim / (2) Não: ");
				op = scan.nextInt();
				
			}
			
			System.out.println("-=-=--=-=--=-=--=-=- Programa encerrado -=-=--=-=--=-=--=-=-");
		}

	}

}
