package cursojava.aula43.exercicios;

public class ContaEspecial extends ContaBancaria {
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public double sacarDinheiro(double qtd) {
		if ((getSaldo() < qtd) && (getSaldo() < limite)) {
			System.out.println("Saldo não pode ser regativo!");
			return -1;
		}

		setSaldo(getSaldo() - qtd);

		return getSaldo();
	}
}
