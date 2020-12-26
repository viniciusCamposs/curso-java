package cursojava.aula20;

import java.util.Scanner;
import java.util.Random;

public class Exercicio01 {

	public static int maior = 0, posicaoI, posicaoJ;

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Random gerador = new Random();
			int[][] matriz = new int[4][4];

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = gerador.nextInt(10);
					if (j == 0) {
						maior = matriz[i][j];
						posicaoI = i;
						posicaoJ = j;

					} else {
						if (matriz[i][j] > maior) {
							maior = matriz[i][j];
							posicaoI = i;
							posicaoJ = j;
						}
					}
					if (i == matriz.length - 1 && j == matriz.length - 1) {
						System.out.println("Maior: " + maior + "\nPosição I: " + posicaoI + "\nPosição J: " + posicaoJ);
					}
				}
			}
		}
	}
}
