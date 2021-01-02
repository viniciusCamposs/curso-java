package cursojava.aula43.exercicios;

public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double sacarDinheiro(double qtd) {

		if (getSaldo() < qtd) {
			System.out.println("Saldo não pode ser regativo!");
			return -1;
		}

		setSaldo(getSaldo() - qtd);

		return getSaldo();
	}

	public double depositar(double qtd) {
		if (qtd < 1) {
			System.out.println("Só é possível realizar depositos com valores acima de 0!");
			return -1;
		}

		setSaldo(getSaldo() + qtd);

		return getSaldo();
	}

}
