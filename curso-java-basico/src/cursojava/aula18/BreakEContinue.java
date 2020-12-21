package cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um número: ");
			int num = scan.nextInt();
			
			System.out.println("Entre com um limite: ");
			int max = scan.nextInt();
			
			for(int i=num; i<=max; i++) {
				if(i %7 == 0) {
					continue;
				}
				System.out.println("Valor de i: " + i);
				
			}
		
			/*for(int i=0; i<=4; i++) {
				rotulo1: {
					rotulo2: {
						rotulo3: {
							if(i == 1) {
								break rotulo1;
							}
							if(i == 2) {
								break rotulo2;
							}
							if(i == 3) {
								break rotulo3;
							}
							System.out.println("Rotulo 3");
						}
						System.out.println("Rotulo 2");
					}
					System.out.println("Rotulo 1");
				}
				System.out.println(i);
			}*/
		
		}

	}
	
}


