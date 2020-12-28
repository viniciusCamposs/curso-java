package cursojava.aula26;

public class Carro {
	String marca;
	public String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
}
