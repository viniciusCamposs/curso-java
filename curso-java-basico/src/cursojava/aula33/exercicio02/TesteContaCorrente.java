package cursojava.aula33.exercicio02;

public class TesteContaCorrente {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(123456, 5000, "Especial", 1000);

		conta.imprimeDados(conta);

		conta.depositarDinheiro(2000);

		conta.imprimeDados(conta);

		conta.realizarSaque(10000);

		conta.realizarSaque(1000);

		conta.imprimeDados(conta);

		conta.verificarCheque(conta);

		conta.consultarSaldo(conta);

	}
}
