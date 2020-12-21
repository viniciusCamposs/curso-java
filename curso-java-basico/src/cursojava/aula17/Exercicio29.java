package cursojava.aula17;

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-= LISTA DOS NUMEROS PRIMOS ENTRE 1 E O NUMERO INFORMADO -=-=-=");
			System.out.println("Informe um número: ");
			int numero = scan.nextInt();
			
			for(int i=2; i<= numero; i++) {
				if(ehPrimo(i)) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }




	
}
