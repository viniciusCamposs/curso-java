package cursojava.aula55;

import cursojava.aula54.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana[] dias = DiaSemana.values();
		
		//for(int i=0; i<dias.length; i++) {
		//	System.out.println(dias[i]);
		//}
		
		for(DiaSemana dia : dias) {
			System.out.println(dia);
		}

	}

}
