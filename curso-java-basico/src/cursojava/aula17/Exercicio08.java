package cursojava.aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
		
			double numero, soma =0, media;
			for(int count=1; count<=5; count++) {
				System.out.println("Número " + count + ": ");
				numero = scan.nextDouble();
				
				soma += numero;
				if(count==5) {
					media = soma/5;
					System.out.println("Soma: " + soma + 
									   "\nMédia: " + media);	
				}
			}
			
		
			
		}

	}

}
