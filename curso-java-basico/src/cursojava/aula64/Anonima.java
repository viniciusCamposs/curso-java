package cursojava.aula64;

public class Anonima {
	
	public void imprimeTexto() {
		System.out.println("Qualquer texto");
	}
	
	public static void main(String[] args) {
		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("Qualquer texto que foi sobrescrito");
			}
		};
		
		anonima.imprimeTexto();
	}
}
