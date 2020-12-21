package cursojava.aula19;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] temperatura = new double[3];
		
		for(int i=0; i<temperatura.length; i++) {
			System.out.println("Dia " + i);
			System.out.println("Entre com a temperatura: ");
			temperatura[i] = scan.nextDouble();
		}
		
		for(double temp : temperatura) {
			System.out.println("Temperatura: " + temp);
		}

	}

}
