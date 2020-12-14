package cursojava.aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("--------------Metros -> Centimetros--------------\n");
			System.out.println("Metros: ");
			double metros = scan.nextDouble();
			
			System.out.println("\nCentimetros: " + metros*100 + " cm");
		}

	}

}
