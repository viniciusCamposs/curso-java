package cursojava.aula49;

public class Finally {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException exception) {
				System.out.println("Não é possivel dividir por 0.");
			} catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("Vetores não possuem o mesmo tamanho.");
			} catch (Throwable exception) {
				System.out.println("Ocorreu um erro");
			}finally {
				System.out.println("Finally executado\n");
			}
		}

	}

}
