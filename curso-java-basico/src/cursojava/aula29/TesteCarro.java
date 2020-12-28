package cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		System.out.println(van.numPassageiros);
		
		Carro gol = new Carro("Fiat", "Bola", 4, 12, 2);
		
		
		System.out.println(gol.marca);

	}

}
