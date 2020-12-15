package cursojava.aula15;

import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o dia da semana: ");
			int dia = scan.nextInt();
			
			switch(dia) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda-feira");
					break;
				case 3: 
					System.out.println("Ter�a-feira");
					break;
				case 4:
					System.out.println("Quarta-Feira");
					break;
				case 5: 
					System.out.println("Quinta-feira");
					break;
				case 6:
					System.out.println("Sexta-feira");
					break;
				case 7: 
					System.out.println("S�bado");
					break;
				default: 
					System.out.println("N�o � um dia v�lido!");
			}
			
			
			
		}
		
	}

}
