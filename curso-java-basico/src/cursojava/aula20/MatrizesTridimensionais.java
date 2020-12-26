package cursojava.aula20;

import java.util.Scanner;

public class MatrizesTridimensionais {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int[][][] matrizesTridimensionais = new int[2][2][2];
			
			System.out.println("-=-=-=-=-= Entrada dos Dados -=-=-=-=-=");
			for(int i=0; i<matrizesTridimensionais.length; i++) {
				System.out.println("-=-= Primeira volta -=-=");
				for(int j=0; j<matrizesTridimensionais.length; j++) {
					System.out.println("-=-= Segunda volta -=-=");
					for(int k=0; k<matrizesTridimensionais.length; k++) {
						System.out.println("-=-= Terceira volta -=-=");
						System.out.println("Dados: ");
						matrizesTridimensionais[i][j][k] = scan.nextInt();
					}
				}
			}
			
			System.out.println("-=-=-=-=-= Saída dos Dados -=-=-=-=-=");
			for(int i=0; i<matrizesTridimensionais.length; i++) {
				for(int j=0; j<matrizesTridimensionais.length; j++) {
					for(int k=0; k<matrizesTridimensionais.length; k++) {
						System.out.printf("\nDados: %d", matrizesTridimensionais[i][j][k]);
					}
				}
			}
		}
	}
}
