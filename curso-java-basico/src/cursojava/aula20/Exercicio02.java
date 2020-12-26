package cursojava.aula20;

import java.util.Scanner;
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			Random gerador = new Random();
			int[][] matriz = new int[10][10];

			int maior = 0, menor = 0;

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = gerador.nextInt(10);
					if (i == 5) {
						if (j == 0) {
							maior = matriz[i][j];
						} else {
							if (matriz[i][j] > maior) {
								maior = matriz[i][j];
							}
						}

						imprimeDados(i, j, maior, menor);

					}

					if (i == 7) {
						if (j == 0) {
							maior = matriz[i][j];
						} else {
							if (matriz[i][j] > maior) {
								maior = matriz[i][j];

							}
						}
						imprimeDados(i, j, maior, menor);
					}
				}
			}

		}

	}

	public static void imprimeDados(int posicaoI, int posicaoJ, int maior, int menor) {
		if (posicaoJ == 9) {
			System.out.println("-=-= Linha " + posicaoI + " -=-=");
			System.out.println("Maior: " + maior + "\nMenor: " + menor);
		}
	}

}
