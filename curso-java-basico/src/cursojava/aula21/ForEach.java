package cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		Random gerador = new Random();
		
		for(int i=0; i<notas.length; i++) {
			notas[i] = gerador.nextInt(10);
		}
		
		System.out.println("-=-=-= Usando o for each -=-=-=");
		for(int nota : notas) {
			System.out.println(nota);
		}
		System.out.println("-=-=-= Fim do programa -=-=-=");

	}

}
