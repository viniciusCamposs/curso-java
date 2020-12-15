package cursojava.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com o turno (M-V-N): ");
			String turno = scan.next();
			
			switch(turno) {
				case "M":
					System.out.println("Bom dia");
					break;
				case "V":
					System.out.println("Boa tarde");
					break;
				case "N": 
					System.out.println("Boa noite");
					break;
				default: 
					System.out.println("Não é um turno válido!");
			}

		}

	}
	
}
