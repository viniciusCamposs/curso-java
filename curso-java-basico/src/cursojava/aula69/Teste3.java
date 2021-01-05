package cursojava.aula69;

public class Teste3 {
	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 1000);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 1000);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1000);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa");

	}
}
