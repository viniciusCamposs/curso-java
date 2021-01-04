package cursojava.aula56.exercicio;

public enum Operadores {
	SOMAR("+") {
		@Override
		public double executarOperacao(double x, double y) {
			return x+y;
		}
	}, SUBTRAIR("-") {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	}, MULTIPLICAR("*") {
		@Override
		public double executarOperacao(double x, double y) {
			return x*y;
		}
	}, DIVIDIR("/") {
		@Override
		public double executarOperacao(double x, double y) {
			return x/y;
		}
	};
	
	private String operador;
	
	Operadores(String operador){
		this.operador = operador;
	}
	
	public String getOperador() {
		return operador;
	}
	
	@Override
	public String toString() {
		return this.operador;
	}
	
	public abstract double executarOperacao(double x, double y);

}
