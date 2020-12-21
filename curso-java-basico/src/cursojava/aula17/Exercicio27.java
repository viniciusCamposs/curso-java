package cursojava.aula17;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			int op=1;
			double maior=0, menor=0, soma=0, count=0;
			while(op==1) {
				System.out.println("Temperatura: ");
				double temperatura = scan.nextDouble();
				
				if(temperatura>maior) {
					maior=temperatura;
				}
				
				if(temperatura<menor) {
					menor=temperatura;
				}
				
				soma += temperatura;
				count++;
				
			
				System.out.println("Deseja sair? (1) Não / (2) Sim");
				op = scan.nextInt();
			}
			
			System.out.println("Maior temperatura: " + maior + 
							   "\nMenor temperatura: " + menor + 
							   "\nMédia de temperatura: " + (soma/count));
			
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-= FIM DO PROGRAMA -=-=-=-=-=-=-=-=-=-=-=-=");
			

		}

	}

}
