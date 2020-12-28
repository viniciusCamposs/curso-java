package cursojava.aula27;

public class Carro {
	String marca;
	public String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	double calculaCombustivel(double km){
		return km/consumoCombustivel;
	}
	
	
}
