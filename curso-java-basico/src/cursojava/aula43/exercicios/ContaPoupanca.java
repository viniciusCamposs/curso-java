package cursojava.aula43.exercicios;

public class ContaPoupanca extends ContaBancaria {
	
	private double qtdDiasRendimento;

	public double getQtdDiasRendimento() {
		return qtdDiasRendimento;
	}

	public void setQtdDiasRendimento(double qtdDiasRendimento) {
		this.qtdDiasRendimento = qtdDiasRendimento;
	}

	public double calcularNovoSaldo(double taxaRendimento) {
		
		super.setSaldo(getSaldo()+(taxaRendimento * qtdDiasRendimento));
		
		return super.getSaldo();
	}
}
