package cursojava.aula27;

import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {
		/* Teste exercicio-01
		Lampada lampada01 = new Lampada();
		
		lampada01.imprimeDados(lampada01);

		lampada01.ligarDesligarLampada(lampada01);
		
		lampada01.imprimeDados(lampada01);
		
		lampada01.ligarDesligarLampada(lampada01);
		
		lampada01.imprimeDados(lampada01);
		*/
		
		/*
		ContaCorrente conta = new ContaCorrente(123456, 5000, "Especial", 1000);
		
		conta.imprimeDados(conta);
		
		conta.depositarDinheiro(2000);
		
		conta.imprimeDados(conta);
		
		conta.realizarSaque(10000);
		
		conta.realizarSaque(1000);
		
		conta.imprimeDados(conta);
		
		conta.verificarCheque(conta);
		
		conta.consultarSaldo(conta);
		*/
		
		try(Scanner scan = new Scanner(System.in)){
			
			Alunos aluno = new Alunos();
			
			System.out.println("Entre com o nome do aluno: ");
			aluno.nome = scan.next();
			
			System.out.println("Entre com o nome do curso: ");
			aluno.curso = scan.next();
			
			System.out.println("Entre com a matricula: ");
			aluno.matricula = scan.next();
			
			for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
				System.out.println("Entre com o nome da disciplina: ");
				aluno.nomeDisciplinas[i] = scan.next();
			}
			
			for(int i=0; i<aluno.notasdisciplinas.length; i++) {
				System.out.println("Obtendo notas da disciplina: " + aluno.nomeDisciplinas[i]);
				
				for(int j=0; j<aluno.notasdisciplinas[i].length; j++) {
					System.out.println("Entre com a nota " + (j+1) + ": ");
					aluno.notasdisciplinas[i][j] = scan.nextDouble();
				}
			}
			
			aluno.imprimirDados();
			
			for(int i=0; i<aluno.nomeDisciplinas.length; i++) {
				if(aluno.verificarAprovado(i)) {
					System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
				}else {
					System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado");
				}
				System.out.println("Média do aluno: " + aluno.obterMedia(i));
			}
			
			;
			
		}
	
		
		
	}

}
