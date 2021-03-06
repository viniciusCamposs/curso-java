package cursojava.aula20;

import java.util.Scanner;

public class Exercicio05 {

	public static String[][][] agenda = new String[12][30][8];
	
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int op=0, diaMes, horaDoDia, mesDoAno;
			while(op != 3) {
				System.out.println("-=-=-=-=-=-= Agenda -=-=-=-=-=-=");
				
				System.out.println("(1) Alterar agenda"
						+ 		   "\n(2) Visualizar agenda"
						+		   "\n(3) Sair"
						+ 		   "\nEscolha sua op��o: ");
				op = scan.nextInt();
				
				switch(op) {
					case 1:
						System.out.println("M�s do ano: ");
						mesDoAno = scan.nextInt();
						validaCampos("mesDoAno", mesDoAno);
						System.out.println("Dia do m�s que deseja alterar: ");
						diaMes = scan.nextInt();
						validaCampos("diaMes", diaMes);
						System.out.println("Hora do dia: ");
						horaDoDia = scan.nextInt();
						validaCampos("horaDoDia", horaDoDia);
						System.out.println("Qual compromisso quer agendar? ");
						agenda[mesDoAno][diaMes][horaDoDia] = scan.next();
						break;
					case 2:
						System.out.println("M�s do ano: ");
						mesDoAno = scan.nextInt();
						System.out.println("Dia do m�s que deseja consultar: ");
						diaMes = scan.nextInt();
						System.out.println("Hora do dia: ");
						horaDoDia = scan.nextInt();

						System.out.println("Compromisso agendado: " + agenda[mesDoAno][diaMes][horaDoDia]);
						break;
				}
			}
			System.out.println("-=-=-=-=-=-= Fim do programa -=-=-=-=-=-=");
		}

	}
	
	public static void validaCampos(String tipo, int dados) {
		Scanner scan = new Scanner(System.in);
		if(tipo.equals("mesDoAno")) {
			while(dados < 0 || dados > 11) {
				System.out.println("M�s do ano: ");
				dados = scan.nextInt();
			}
		}else if(tipo.equals("diaMes")) {
			while(dados < 0 || dados > 29) {
				System.out.println("Dia do m�s que deseja alterar: ");
				dados = scan.nextInt();
			}
		}else if(tipo.equals("horaDoDia")) {
			while(dados < 0 || dados > 7) {
				System.out.println("Hora do dia: ");
				dados = scan.nextInt();
			}
		}else {
			System.out.println("Par�metros errados.");
		}
	}
}
