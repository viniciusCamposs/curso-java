package cursojava.aula67;

public class MinhaThread extends Thread{
	
	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
