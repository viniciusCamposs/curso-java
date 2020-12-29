package cursojava.aula34.exercicios;

public class Calculadora {
	
	private double num1, num2;

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public static double somar(double num1, double num2) {
		return num1+num2;
	}
	
	public static double subtrair(double num1, double num2) {
		return num1-num2;
	}
	
	
	public static double multiplicar(double num1, double num2) {
		return num1*num2;
	}
	
	public static double dividir(double num1, double num2) {
		return num1/num2;
	}
	
	public static double potencia(double num1, int potencia) {
		return Math.pow(num1, potencia);
	}
	
	public static void fatorial(int numero) {
		int fatorial = numero;
		int resultado=numero;
		System.out.printf("%d! = ", numero);
		while(fatorial>1) {
			System.out.print(fatorial + " . ");
			resultado = (resultado * (fatorial-1));
			fatorial--;
			if(fatorial==1) {
				System.out.print("1 = " + resultado);
			}
		}
	}
	
}
