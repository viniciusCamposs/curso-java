package cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		try(Scanner scan = new Scanner(System.in)){
			System.out.println("------------------ CADASTRO DE USUÁRIO ------------------");
			
			System.out.println("Entre com o usuário: ");
			String usuario = scan.next();
			
			System.out.println("Entre com a senha: ");
			String senha = scan.next();
			
			while(usuario.equals(senha)) {
				System.out.println("------------------ SENHA INVÁLIDA ------------------");
				System.out.println("Entre com a senha: ");
				senha = scan.next();
			}
			
			System.out.println("------------------ CADASTRO REALIZADO COM SUCESSO ------------------");
		}

	}

}
