package cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine(); 
		System.out.println("\nSeu nome: " + nomeCompleto);
		
		System.out.println("\nDigite seu primeiro nome: ");
		String primeiroNome = scan.next(); 
		System.out.println("\nSeu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		double altura = scan.nextDouble();
		boolean bichinhoEstimacao = scan.nextBoolean();
		
		System.out.println("Seu primeiro nome: " + primeiroNome + 
						   "\nSua idade: " + idade + 
						   "\nQuantidade de filhos: " + qtdFilhos + 
						   "\nAltura: " + altura + 
						   "\nTem pet?: " + bichinhoEstimacao);
		
		
		
	}
	
}
