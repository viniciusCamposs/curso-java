package cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {
		
		String alfabeto = String.join(", ", "A", "B", "C", "D");
		System.out.println(alfabeto);
		
		String alfabeto2 = String.join("||", "A", "B", "C", "D");
		System.out.println(alfabeto2);
		
		String[] letras = alfabeto.split(", ");
		for(String letra : letras) {
			System.out.println(letra);
		}
		
		String doArquivo = "1;Antônio;30;";
		String[] infos = doArquivo.split(";");
		for(String info : infos) {
			System.out.println(info);
		}
	}

}
