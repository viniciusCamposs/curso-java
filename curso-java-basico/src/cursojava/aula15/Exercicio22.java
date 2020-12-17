package cursojava.aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Quantos kgs de morango? ");
			double morangoKgs = scan.nextDouble();
			
			System.out.println("Quantos kgs de maçã? ");
			double macaKgs = scan.nextDouble();
			
			double precoMorangos, precoMaca;
			
			if(morangoKgs > 0 && morangoKgs <= 5) {
				precoMorangos = 2.50 * morangoKgs;
				if(((morangoKgs + macaKgs) > 8 ) || (precoMorangos > 25)) {
					precoMorangos -= ((precoMorangos*10)/100);				
				}
				System.out.println(retornaDados(precoMorangos, "Morangos"));
			}else if(morangoKgs > 5) {
				precoMorangos = 2.20 * morangoKgs;
				if(((morangoKgs + macaKgs) > 8 ) || (precoMorangos > 25)) {
					precoMorangos -= ((precoMorangos*10)/100);				
				}
				System.out.println(retornaDados(precoMorangos, "Morangos"));
			}
			
			if(macaKgs > 0 && macaKgs <= 5) {
				precoMaca = 1.80 * macaKgs;
				if(((macaKgs + morangoKgs) > 8 ) || (precoMaca > 25)) {
					precoMaca -= ((precoMaca)/100);				
				}
				System.out.println(retornaDados(precoMaca, "Maçãs"));
			}else if(macaKgs > 5) {
				precoMaca = 1.50 * macaKgs;
				if(((macaKgs + morangoKgs) > 8 ) || (precoMaca > 25)) {
					precoMaca -= ((precoMaca*10)/100);				
				}
				System.out.println(retornaDados(precoMaca, "Maçãs"));
			}

		}

	}
	public static String retornaDados(double precoMorangos, String fruta) {
		return "Preço a pagar pelos(as) " + fruta + ": " + precoMorangos;
	}

}
