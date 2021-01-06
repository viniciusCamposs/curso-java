package cursojava.aula85_aula100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		Calendar hoje = Calendar.getInstance(); //singleton
		
		System.out.println(hoje);
		
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		
		
		System.out.println(ano);
		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora+":"+minutos+":"+segundos);
		
		System.out.printf("Hoje é: %02d/%02d/%d às %d:%d:%d", dia, (mes+1), ano, hora, minutos, segundos);
		
		hoje.add(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println();
		
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));

		
		hoje.add(Calendar.YEAR, 1);
		
		System.out.println(hoje.get(Calendar.YEAR));
		
	}

}
