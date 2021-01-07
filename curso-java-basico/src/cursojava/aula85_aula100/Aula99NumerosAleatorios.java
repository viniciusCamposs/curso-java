package cursojava.aula85_aula100;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {

		// System.out.println(Math.floor((Math.random())*10));

		Random numeros = new Random();

		System.out.println(numeros.nextInt(5 + 1));

	}

}
