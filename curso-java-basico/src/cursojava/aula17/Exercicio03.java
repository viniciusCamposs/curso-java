package cursojava.aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Entre com um nome: ");
			String nome = scan.nextLine();
			
			while(nome.length() < 3) {
				System.out.println("Entre com um nome válido: ");
				nome = scan .nextLine();
			}
			
			System.out.println("Entre com a idade: ");
			int idade = scan.nextInt();
			
			while(idade < 0 || idade > 150) {
				System.out.println("Entre com uma idade válida: ");
				 idade = scan.nextInt();
			}
			
			System.out.println("Entre com o salário: ");
			double salario = scan.nextDouble();
			
			
			while(salario < 0) {
				System.out.println("Entre com um salário válido: ");
				salario = scan.nextDouble();
			}
			
			System.out.println("Entre com o sexo: ");
			String sexo = scan.next();
			
			while(!sexo.equals("F") || !sexo.equals("M")) {
				System.out.println("Entre com um sexo válido: ");
				sexo = scan.nextLine();
				if(sexo.equals("F") || sexo.equals("M")) {
					break;
				}	
			}
			
			System.out.println("Entre com o estado civil: ");
			String estadoCivil = scan.next();
			
			while(!estadoCivil.equals("S") || !estadoCivil.equals("C") || !estadoCivil.equals("V") || !estadoCivil.equals("D")) {
				System.out.println("Entre com um estado civil válido: ");
				estadoCivil = scan.nextLine();
				if(estadoCivil.equals("S") || estadoCivil.equals("C") || estadoCivil.equals("V") || estadoCivil.equals("D")) {
					break;
				}
			}
			
			System.out.println("Nome: " + nome + 
					   "\nIdade: " + idade + 
					   "\nSalário: " + salario + 
					   "\nSexo: " + sexo + 
					   "\nEstado Civil: " + estadoCivil);
			

		}
		

	}
	


}
