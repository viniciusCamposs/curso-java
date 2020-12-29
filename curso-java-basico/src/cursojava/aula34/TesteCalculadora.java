package cursojava.aula34;

public class TesteCalculadora {
	
	static int resultSoma;
	
	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		
		soma2Valores(1, 2);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		return num1+num2;
	}
	
	
}
