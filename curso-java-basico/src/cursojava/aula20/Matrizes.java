package cursojava.aula20;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("-=--=-= Entrada dos Dados -=--=-=");
			int[][] matriz = new int[2][2];
			
			for(int i=0; i<matriz.length; i++) {
				System.out.printf("-=-= Aluno %d -=-=\n", (i+1));
				for(int j=0; j<2; j++) {
					System.out.printf("Nota %d: ", (j+1));
					matriz[i][j] = scan.nextInt();
				}
			}
			
			System.out.print("-=--=-= Saída dos Dados -=--=-=");
			for(int i=0; i<2; i++) {
				System.out.printf("\n-=-= Aluno %d -=-=", (i+1));
				for(int j=0; j<2; j++) {
					System.out.printf("\nNota %d: %d", (j+1), matriz[i][j]);
				}
			}
		}
		
	}
	
	
	
}
