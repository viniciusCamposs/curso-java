package cursojava.aula13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio13 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com a sua altura: ");
			double altura = scan.nextDouble();
			
			System.out.println("Entre com o seu sexo: ");
			String sexo = scan.next();
			
			System.out.println("\nEntre com o seu peso: ");
			double peso = scan.nextDouble();
			
			if(sexo.equals("M")) {
				double pesoIdealHomem = (72.7*altura) - 58;
				arredondar(pesoIdealHomem);
				if(peso > pesoIdealHomem) {
					System.out.println("Você esta acima do peso ideal!");
				}else if(peso < pesoIdealHomem) {
					System.out.println("Você esta abaixo do peso ideal!");
				}else {
					System.out.println("Você esta no peso ideal!");
				}
			}else {
				double pesoIdealMulher = (62.1*altura) - 44;
				arredondar(pesoIdealMulher);
				if(peso > pesoIdealMulher) {
					System.out.println("Você esta acima do peso ideal!");
				}else if(peso < pesoIdealMulher) {
					System.out.println("Você esta abaixo do peso ideal!");
				}else {
					System.out.println("Você esta no peso ideal!");
				}
			}
			
		}
	}
	
	public static void arredondar(double valor) {
		System.out.println("Peso ideal: " + new DecimalFormat("#,##0.00").format(valor));
	}

}
