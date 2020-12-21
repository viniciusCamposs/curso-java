package cursojava.aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Número 1: ");
			double numero1 = scan.nextDouble();
			
			System.out.println("Número 2: ");
			double numero2 = scan.nextDouble();
			
			System.out.println(exp(numero1, numero2));
			
		}
	}
	
	public static double exp(double base,double expoente)   
	{
		if (expoente < 0 ){
	            System.out.println("Apenas expoentes positivos");
	        }

	        if (base==1){
	          return 1;
	        }

	       int potencia=1;
		
		for ( double i = 0 ; i < expoente; i++){
	             potencia *= base;
	        }

		return potencia; 
	    
	}

}
