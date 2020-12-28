package cursojava.aula31;

public class Carro {
	String marca;
	public String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel);
	
	}
	
	public double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
		
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		
		return divideKMPorConsumoCombustivel(km);
			
	}
}
