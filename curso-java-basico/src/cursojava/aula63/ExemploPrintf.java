package cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		System.out.printf("%s", "Olá, mundo!\n");
		System.out.printf("%S", "Olá, mundo!");
		
		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');
		System.out.println();
		
		int valor = 123246789;
		System.out.printf("%d", valor);
		System.out.println();
		
		double pontoFlutuante = 3.14;
		System.out.printf("%f", pontoFlutuante);
		
		String olaMundo = "Olá, mundo!";
		System.out.println();
		System.out.printf("%20s", olaMundo);
		System.out.println();
		System.out.printf("%-20s", olaMundo);
		System.out.println();
		System.out.printf("%+d", valor);
		System.out.println();
		System.out.printf("%015d", valor);
		System.out.println();

		int valor2 = -123456;
		
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor);
		
		System.out.printf("%.3f", pontoFlutuante);
		System.out.println();
		System.out.printf("R$%.2f", pontoFlutuante);
	
		
		//testeMaisCompleto();
	}
	
	private static void testeMaisCompleto() {
		double[] precos = {1, 2, 3, 4, 5};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%.10.2f\n", "Item", i+1, precos[i]);
		}
		
		
	}

}
