package cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			/*System.out.println("Entre com sua idade: ");
			int idade = scan.nextInt();
			
			if(idade >= 18) {
				System.out.println("Maior de idade!");
			}else {
				System.out.println("N�o � maior de idade!");
			}*/
			
			System.out.println("Entre com o pre�o do item: ");
			double valor = scan.nextDouble();
			
			if(valor <= 10) {
				System.out.println("Est� barato, pode comprar");
			}else if(valor > 10 && valor < 15 ) {
				System.out.println("Voc� pode pedir um desconto");
			}else if(valor >= 15 && valor < 17) {
				System.out.println("Pode pesquisar mais");
			}else {
				System.out.println("Muito caro");
			}
		}


	}

}
