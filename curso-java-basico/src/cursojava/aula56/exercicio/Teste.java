package cursojava.aula56.exercicio;

public class Teste {

	public static void main(String[] args) {
		
		double x = 2;
		double y = 3;
		
		
		Operadores op = Operadores.SOMAR;
		
			System.out.println(x + " " + op.toString() + " " +  y + " = " + op.executarOperacao(x, y));
		
		
	}

}
