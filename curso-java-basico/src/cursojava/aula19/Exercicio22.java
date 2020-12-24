package cursojava.aula19;

import java.util.Random;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		int[] numeroAleatorio = new int[3];
		int count=0;
		double percentual;
		
		System.out.println("-=-=-=-=-=-= Inicio do programa -=-=-=-=-=-=");
		for(int i=0; i<3; i++) {
			numeroAleatorio[i] = gerador.nextInt(2);
			if(numeroAleatorio[i]==0) {
				count++;
			}
		}
		
		
		
		for(int i=0; i<numeroAleatorio.length; i++) {
			percentual = (count*100)/numeroAleatorio.length;
			System.out.println(i + ") Valor: " + numeroAleatorio[i]);
			
			if(i==numeroAleatorio.length-1) {
				System.out.println("Porcentagem de 0: " + percentual + 
								   "\nPorcentagem de 1: " + (100-percentual));	
			}
		}
		
		System.out.println("-=-=-=-=-=-= Fim do programa -=-=-=-=-=-=");

	}

}
