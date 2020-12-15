package cursojava.aula13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Tamanho em metros quadrados da área a ser pintada: ");
			double tamanho = scan.nextDouble();
			double quantLatas = 0, precoLatas = 0, quantGaloes = 0, precoGaloes = 0;
			
			double quantTinta = tamanho/6;
			
			//CONDIÇÕES PARA A SITUAÇÃO 1.
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
			
			//CONDIÇÕES PARA A SITUAÇÃO 2.
			if(quantTinta<=3.6) {
				quantGaloes = 1;
				precoGaloes = 25;
			}else {
				quantGaloes = quantTinta/3.6;
				precoGaloes = (int) quantGaloes * 25;
			}
			
			if(quantGaloes %1 > 0) {
				quantGaloes += 1;
				precoGaloes = (int) quantGaloes * 25;
			}
			
			System.out.println("------------------ Situação 1 ------------------");
			System.out.print("Quantidade de tinta: "); arredondar(quantTinta);
			System.out.print("Preço: "); arredondar(precoLatas);
			
			System.out.println("------------------ Situação 2 ------------------");
			System.out.println("Quantidade de tinta: "); arredondar(quantTinta);
			System.out.println("Preço: "); arredondar(precoGaloes);
		}
	}
	public static void arredondar(double valor) {
		System.out.println(new DecimalFormat("#,##0.00").format(valor));
	}
}