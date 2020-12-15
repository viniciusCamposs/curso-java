package cursojava.aula15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Entre com M ou F: ");
			String sexo = scan.next();
			
			switch(sexo) {
				case "M":
					System.out.println("Masculino");
					break;
				case "F":
					System.out.println("Feminino");
					break;
				default:
					System.out.println("Opção inválida!");
			}
			

		}

	}

}
