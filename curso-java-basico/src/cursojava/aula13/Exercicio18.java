package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio18 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com o tamanho do arquivo em MB");
			double sizeFile = scan.nextDouble();
			
			System.out.println("Entre com a velocidade de download em Mbps: ");
			double downloadSpeed = scan.nextDouble();
			
			double downloadTime = (sizeFile / downloadSpeed) / 60;
			
			System.out.println("Tamanho do arquivo: " + sizeFile +
							   "\nVelocidade de download: " + downloadSpeed);
			
			arredondar(downloadTime);
		}
	}
	
	public static void arredondar(double valor) {
		System.out.println("Tempo de download estimado em minutos: " + new DecimalFormat("#,##0.00").format(valor));
	}

}
