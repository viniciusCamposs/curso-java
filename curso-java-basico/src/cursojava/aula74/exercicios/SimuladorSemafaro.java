package cursojava.aula74.exercicios;

public class SimuladorSemafaro {

	public static void main(String[] args) {

		ThreadSemaforo semafaro = new ThreadSemaforo();

		for (int i = 0; i < 10; i++) {
			System.out.println(semafaro.getCor());
			semafaro.esperarCorMudar();
		}
		
		semafaro.desligarSemafaro();
	}

}
