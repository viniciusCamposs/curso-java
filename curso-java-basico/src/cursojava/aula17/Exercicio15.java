package cursojava.aula17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
	        int num1 = 1, num2 = 0;
	        
	        System.out.println(num2);
	        System.out.println(num1);
	        
	        for(int i = 0; i < 8; i++){
	            num1 = num1 + num2;
	            num2 = num1 - num2;
	            System.out.println(num1);
	        }

	}

	}
}
