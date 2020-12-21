package cursojava.aula17;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int op=1;
		try(Scanner scan = new Scanner(System.in)){
			while(op==1) {
				System.out.println("-=-=--=-=--=-=--=-=- Pa�s A -=-=--=-=--=-=--=-=-");
				System.out.println("Entre com o n�mero de habitantes: ");
				double pais1Habitantes = scan.nextDouble();
				
				System.out.println("Taxa de crescimento: ");
				double pais1Taxa = scan.nextDouble();
				
				System.out.println("-=-=--=-=--=-=--=-=- Pa�s B -=-=--=-=--=-=--=-=-");
				System.out.println("Entre com o n�mero de habitantes: ");
				double pais2Habitantes = scan.nextDouble();
				
				System.out.println("Taxa de crescimento: ");
				double pais2Taxa = scan.nextDouble();
				
				int count = 0;
				
				if(pais1Habitantes >= pais2Habitantes) {
					System.out.println("Pa�s A j� possui um n�mero igual ou maior de habitantes que o pa�s B");
				}else {
					while(pais2Habitantes > pais1Habitantes) {
						pais1Habitantes += ((pais1Habitantes*pais1Taxa)/100);
						
						pais2Habitantes += ((pais2Habitantes*pais2Taxa)/100);
						
						count++;
					}
					System.out.println("N�mero de anos necess�rios: " + count);
				}
				
				System.out.println("Deseja continuar? (1) Sim / (2) N�o: ");
				op = scan.nextInt();
				
			}
			
			System.out.println("-=-=--=-=--=-=--=-=- Programa encerrado -=-=--=-=--=-=--=-=-");
		}

	}

}
