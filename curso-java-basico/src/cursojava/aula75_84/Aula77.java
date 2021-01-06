package cursojava.aula75_84;

public class Aula77 {
	public static void main(String[] args) {
		
		String java = "Java";
		
		for(int i=0; i<java.length(); i++) {
			System.out.print(java.charAt(i)); // Pega o caractere de um certo índice.
		}
		
		System.out.println();
		
		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		
		//seria o mesmo que
		for(int i=0; i<3; i++) {
			jav[i] = java.charAt(i);
		}
		System.out.println(jav);
		
		char[] javaChars = java.toCharArray();
		
		System.out.println(javaChars);
		
		
	}
}
