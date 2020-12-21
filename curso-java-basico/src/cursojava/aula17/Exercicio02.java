package cursojava.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		try(Scanner scan = new Scanner(System.in)){
			System.out.println("------------------ CADASTRO DE USU�RIO ------------------");
			
			System.out.println("Entre com o usu�rio: ");
			String usuario = scan.next();
			
			System.out.println("Entre com a senha: ");
			String senha = scan.next();
			
			while(usuario.equals(senha)) {
				System.out.println("------------------ SENHA INV�LIDA ------------------");
				System.out.println("Entre com a senha: ");
				senha = scan.next();
			}
			
			System.out.println("------------------ CADASTRO REALIZADO COM SUCESSO ------------------");
		}

	}

}
