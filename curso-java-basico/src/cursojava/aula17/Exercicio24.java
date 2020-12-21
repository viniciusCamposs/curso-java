package cursojava.aula17;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio24 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Preço do pão: ");
			double precoPao = scan.nextDouble();
			
			for(int i=0; i<50; i++) {
				System.out.print((i+1) + " - R$");
				formatarDecimal(precoPao*i);
			}
		}

	}
	
	public static void formatarDecimal(double valor) {
		System.out.println(new DecimalFormat("#,##0.00").format(valor));
	}

}
