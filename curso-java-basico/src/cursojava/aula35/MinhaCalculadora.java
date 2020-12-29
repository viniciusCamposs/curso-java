package cursojava.aula35;

public class MinhaCalculadora {
	
	public static void fatorialNaoRecursivo(int numero) {
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
		System.out.println();
	}
	
	public static int fatorial(int num) {
		if(num==0) {
			return 1;
		}
		
		return num * fatorial(num-1);
	}
	
}
