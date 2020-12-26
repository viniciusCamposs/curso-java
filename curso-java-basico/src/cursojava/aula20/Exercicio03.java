package cursojava.aula20;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		System.out.println("-=-=-=-=-=-= Entrada dos Dados -=-=-=-=-=-=");
		try(Scanner scan = new Scanner(System.in)){
			int[][] matriz = new int[3][3];
			
			
			int countPares=0, countImpares=0;
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz.length; j++) {
					System.out.println("Linha " + i + " e posição " + j + " : ");
					matriz[i][j] = scan.nextInt();
					if(matriz[i][j] %2 == 0) {
						countPares++;
					}else {
						countImpares++;
					}
					imprimeDados(i, j, matriz, countPares, countImpares);
				}
				
			}
		}

	}
	
	public static void imprimeDados(int posicaoI, int posicaoJ, int[][] matriz, int countPares, int countImpares) {
		if(posicaoI==2 && posicaoJ==2) {
			System.out.println("-=-=-=-=-=-= Saída dos Dados -=-=-=-=-=-=");
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					System.out.println("Linha " + i + " e posição " + j + " : " + matriz[i][j]);
				}
			}
			System.out.println("Quantidade de números pares: " + countPares + 
							   "\nQuantidade de números ímpares: " + countImpares);	
		}
	}

}
