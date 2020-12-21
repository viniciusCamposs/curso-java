package cursojava.aula17;

public class Exercicio16 {

	public static void main(String[] args) {
        int num1 = 1, num2 = 0;
        
        System.out.println(num2);
        System.out.println(num1);
        
        while(num1<500){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }

	}

}
