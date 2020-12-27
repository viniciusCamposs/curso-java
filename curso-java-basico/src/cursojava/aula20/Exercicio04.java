package cursojava.aula20;

import java.util.Scanner;

public class Exercicio04 {

	public static String[][] agenda = new String[30][24];
	
	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			int op=0, diaMes, horaDoDia;
			while(op != 3) {
				System.out.println("-=-=-=-=-=-= Agenda -=-=-=-=-=-=");
				
				System.out.println("(1) Alterar agenda"
						+ 		   "\n(2) Visualizar agenda"
						+		   "\n(3) Sair"
						+ 		   "\nEscolha sua opção: ");
				op = scan.nextInt();
				
				switch(op) {
					case 1:
						System.out.println("Dia do mês que deseja alterar: ");
						diaMes = scan.nextInt();
						System.out.println("Hora do dia: ");
						horaDoDia = scan.nextInt();
						System.out.println("Qual compromisso quer agendar? ");
						agenda[diaMes][horaDoDia] = scan.next();
						System.out.println("Compromisso agendado: " + agenda[diaMes][horaDoDia]);
						break;
					case 2:
						System.out.println("Dia do mês que deseja consultar: ");
						diaMes = scan.nextInt();
						System.out.println("Hora do dia: ");
						horaDoDia = scan.nextInt();

						System.out.println("Compromisso agendado: " + agenda[diaMes][horaDoDia]);
						break;
				}
			}
			System.out.println("-=-=-=-=-=-= Fim do programa -=-=-=-=-=-=");
		}

	}
}
