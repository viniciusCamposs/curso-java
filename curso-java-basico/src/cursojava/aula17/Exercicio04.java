package cursojava.aula17;

public class Exercicio04 {

	public static void main(String[] args) {

		double paisA = 80000;
		double paisB = 200000;
		int count=0;
		
		while(paisB>paisA) {
			paisA += ((paisA*3)/100);
			paisB += ((paisB*1.5)/100);
			
			count++;
		}
		
		System.out.println("Número de anos necessários: " + count);
		
		

	}

}
