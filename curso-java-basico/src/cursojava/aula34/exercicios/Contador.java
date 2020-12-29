package cursojava.aula34.exercicios;

public class Contador {
	private static int contador=0;
	
	public Contador(){
		contador++;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Contador.contador = contador;
	}
	
	public static void zerarContador() {
		setContador(0);
	}
	
	public static void incrementarValorAoContador(int num) {
		setContador(getContador() + num);
	}
	
	public static int retornarValorDoContador() {
		return getContador();
	}
	
}
