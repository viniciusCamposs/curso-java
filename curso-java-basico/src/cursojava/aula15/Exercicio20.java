package cursojava.aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int contador = 0 ;
			int resposta;
			
			
			System.out.println("Telefou para a v�tima? (1) Sim / (2) N�o: ");
			resposta = scan.nextInt();
			if(resposta == 1) {
				contador++;
			}
			
			System.out.println("Esteve no local do crime? (1) Sim / (2) N�o: ");
			resposta = scan.nextInt();
			if(resposta == 1) {
				contador++;
			}
			System.out.println("Mora perto da v�tima? (1) Sim / (2) N�o: ");
			resposta = scan.nextInt();
			if(resposta == 1) {
				contador++;
			}
			System.out.println("Devia para a v�tima? (1) Sim / (2) N�o: ");
			resposta = scan.nextInt();
			if(resposta == 1) {
				contador++;
			}
			System.out.println("J� trabalhou com a v�tima? (1) Sim / (2) N�o: ");
			resposta = scan.nextInt();
			if(resposta == 1) {
				contador++;
			}
			
			System.out.println("Contador: " + contador);
			verificaParticipacao(contador);
			
			
		}

	}
	

	
	public static void verificaParticipacao(int contador) {
		if(contador > 0 && contador<=1) {
			System.out.println("Inocente");
		}
		else if(contador == 2) {
			System.out.println("Suspeita");
		}else if(contador > 2 && contador <=4 ) {
			System.out.println("C�mplice");
		}else if(contador > 4) {
			System.out.println("Assassino");
		}
	}

}
