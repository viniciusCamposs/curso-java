package cursojava.aula45;

public class Teste2 {
	public static void main(String[] args) {
		Object obj1 = obterString();
		String s1 = (String) obj1;
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		Object obj3 = new Object();
		String s3 = (String) obj3;
	}
	
	public static String obterString() {
		return "minha String";
	}
	
}
