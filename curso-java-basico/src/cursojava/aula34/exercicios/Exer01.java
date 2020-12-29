package cursojava.aula34.exercicios;

public class Exer01 {

	public static void main(String[] args) {
		
		System.out.println(Contador.retornarValorDoContador());
		
		Contador.incrementarValorAoContador(2);
		
		System.out.println(Contador.retornarValorDoContador());
		
		Contador.zerarContador();
		
		
		System.out.println(Contador.retornarValorDoContador());

	}

}
