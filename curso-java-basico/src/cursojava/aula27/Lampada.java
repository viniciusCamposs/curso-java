package cursojava.aula27;

public class Lampada {
	/* Declara��o das vari�veis */
	boolean status;
		
	/* Cria��o dos m�todos da classe */
	void imprimeDados(Lampada lampada) {
		System.out.println("Status da l�mpada: "  + lampada.status);	 
	}
	
	void ligarDesligarLampada(Lampada lampada) {
		lampada.status = !lampada.status;
	}
	
	
}
