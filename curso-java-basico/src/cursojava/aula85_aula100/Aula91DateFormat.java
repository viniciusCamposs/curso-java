package cursojava.aula85_aula100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {
	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(Locale.getDefault());
		
		
		Locale.setDefault(new Locale("pt_BR", "Brazil"));
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		String data = "12-12-2020 14:25";

		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

		
		
	}
}
