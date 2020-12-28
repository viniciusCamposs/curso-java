package cursojava.aula30;

public class Carro {
	String marca;
	public String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe carro foi instanciada");
		numPassageiros = 4;
	}
	
	Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	Carro(String marca, String modelo, int numPassageiros){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parâmetros");
	}
	
	
	Carro(String marca, String modelo){
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parâmetros");
	}
	
	
}
