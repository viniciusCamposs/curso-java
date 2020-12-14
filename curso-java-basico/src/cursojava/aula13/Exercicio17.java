package cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Tamanho em metros quadrados da área a ser pintada: ");
			double tamanho = scan.nextDouble();
			double quantLatas = 0, precoLatas = 0, quantGaloes = 0;
			
			double quantTinta = tamanho/6;
			if(quantTinta<=18) {
				quantLatas = 1;
				precoLatas =  80;
			}else {
				quantLatas = quantTinta/18;
				precoLatas = (int) quantLatas * 80;
			}
			
			if(quantLatas %1 > 0) {
				quantLatas += 1;
				precoLatas = (int) quantLatas * 80;
			}
			
			
			System.out.print("Quantidade de tinta: "); arredondar(quantTinta);
			System.out.println("Quantidade de latas de tinta: " + Math.round(quantLatas));
			System.out.print("Preço: "); arredondar(precoLatas);
		}
	}
	public static void arredondar(double valor) {
		System.out.println(new DecimalFormat("#,##0.00").format(valor));
	}
}