package cursojava.aula43.exercicios;

public class Exer01 {

	public static void main(String[] args) {
		
		ContaPoupanca poupanca = new ContaPoupanca();
		
		ContaEspecial especial = new ContaEspecial();
		
		poupanca.setSaldo(5000);
		poupanca.setNomeCliente("Vinicius");
		poupanca.setNumConta("123456");
		poupanca.setQtdDiasRendimento(2);
		
		System.out.println(poupanca.getSaldo());
		
		poupanca.depositar(2000);
		
		System.out.println(poupanca.getSaldo());
		
		poupanca.sacarDinheiro(5000);
		
		System.out.println(poupanca.getSaldo());
		
		poupanca.calcularNovoSaldo(20);
		
		System.out.println(poupanca.getSaldo());
		
		
		

	}

}
