package cursojava.aula19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			double[] nota1 = new double[10];
			double[] nota2 = new double[10];
			double[] soma = new double[10];
			double[] media = new double[10];
			
			for(int i=0; i<10; i++) {
				System.out.printf("-=-=-= ALUNO %d -=-=-=", i);
				System.out.println("\nEntre com a nota 1: ");
				nota1[i] = scan.nextDouble();
				
				System.out.println("Entre com a nota 2: ");
				nota2[i] = scan.nextDouble();
				
				soma[i] = nota1[i]+nota2[i];
				
				if(i==9) {
					for(int j=0; j<10; j++) {
						media[j] = soma[j]/2;
						
						if(media[j]>=7) {
							System.out.println("-=-=-=Aluno " + j + "-=-=-=");
							System.out.println("Nota 1: " + nota1[j] + 
											   "\nNota 2: " + nota2[j] + 
											   "\nMedia: " + media[j] + 
											   "\nSituação: APROVADO");
						}else {
							System.out.println("-=-=-=Aluno " + j + "-=-=-=");
							System.out.println("Nota 1: " + nota1[j] + 
											   "\nNota 2: " + nota2[j] + 
											   "\nMedia: " + media[j] + 
											   "\nSituação: REPROVADO");
						}
					}
				}
			}
		}

	}

}
