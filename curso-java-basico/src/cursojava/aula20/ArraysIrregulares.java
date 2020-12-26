package cursojava.aula20;

import java.util.Scanner;

public class ArraysIrregulares {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com o número de pessoas entrevistadas: ");
			int pessoasEntrevistadas = scan.nextInt();
			
			String[][] nomeFilhos = new String[pessoasEntrevistadas][];
			
			int qtdFilhos;
			for(int i=0; i<nomeFilhos.length; i++) {
				System.out.println("Pessoa " + (i+1) + " possui quantos filhos? ");
				qtdFilhos = scan.nextInt();
				
				nomeFilhos[i] = new String[qtdFilhos];

				for(int j=0; j<nomeFilhos[i].length; j++) {
					System.out.println("Nome do filhos " + (i+j) + ": ");
					nomeFilhos[i][j] = scan.next();
				}
	
			}
			
			System.out.println("-=-= Saída dos Dados -=-=");
			for(int i=0; i<nomeFilhos.length; i++) {
				System.out.println("Pessoa " + (i+1) + " ");

				for(int j=0; j<nomeFilhos[i].length; j++) {
					System.out.println("Filho " + (j+1) + ": " + nomeFilhos[i][j]);
				}
	
			}
		}

	}

}
