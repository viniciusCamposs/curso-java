package cursojava.aula52;

public class UsandoMinhaException {

	public static void main(String[] args) {

		int[] numeros = { 4, 8, 5, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				if(numeros[i] %2 ==0) {
					throw new DivisaoNaoExata(numeros[i], denom[i]);
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Não é possivel dividir por 0.");
			}catch(Exception e) {
				System.out.println("Aconteceu um erro");
				e.printStackTrace();
			}
		}

	}

}
