package cursojava.aula17;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Salário inicial: ");
			double salarioInicial = scan.nextDouble();
			
			double salarioAjustado=0, percentual=1.5;
			
			for(int i=1995; i<=2020; i++) {
				if(i==1995) {
					salarioAjustado = salarioInicial;
					System.out.println(i+  ": " + salarioAjustado);
				}
				else if(i==1996) {
					salarioAjustado += (salarioAjustado/100)*percentual;
					System.out.println("1996: " + salarioAjustado);
				}else {
					percentual *= 2;
					salarioAjustado += (salarioAjustado/100)*percentual;
					System.out.println(i + ": " + salarioAjustado);
				}
				
			}
		}

	}

}
