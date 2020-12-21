package cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		/*
		for(int i=0; i<10; i++) {
			System.out.println("Valor de I: " + (i+1));
		}
		*/
		
		/*
		for(int i=0, j=10; i<j; i++, j--) {
			System.out.println("Valor de I e J: " + i + " " + j);
		}
		*/
		/*
		int i=0;
		for(; i < 5;) {
			System.out.println("Valor de i: " + (i+1));
			i++;
		}
		*/
		int soma = 0;
		
		for(int i=1; i<5; soma+= i++);
		
		System.out.println("O valor da soma é: " + soma);

	}

}
