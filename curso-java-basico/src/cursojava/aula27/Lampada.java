package cursojava.aula27;

public class Lampada {
	/* Declaração das variáveis */
	boolean status;
		
	/* Criação dos métodos da classe */
	void imprimeDados(Lampada lampada) {
		System.out.println("Status da lâmpada: "  + lampada.status);	 
	}
	
	void ligarDesligarLampada(Lampada lampada) {
		lampada.status = !lampada.status;
	}
	
	
}
