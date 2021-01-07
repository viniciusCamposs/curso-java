package cursojava.aula85_aula100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {
	public static void main(String[] args) {
		/*
		 * try { diferencaDataAteJava7(); } catch (ParseException e) {
		 * e.printStackTrace(); }
		 */
		
		//diferencaDataJava8();
		//diferencaDataJava8ComTempo();
		diferencaDataJava8ComChronoUnit();
	}

	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date primeiraDt = sdf.parse("01/01/2019");
		Date segundaDt = sdf.parse("01/02/2019");

		long diffEmMil = Math.abs(segundaDt.getTime() - primeiraDt.getTime());

		long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);

		int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24));

		System.out.println(diff);
		System.out.println(dias);

	}

	public static void diferencaDataJava8() {
		LocalDate data1 = LocalDate.of(2019, 01, 01);
		LocalDate data2 = LocalDate.of(2019, 02, 10);

		Period periodo = Period.between(data1, data2);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);
	}
	
	public static void diferencaDataJava8ComTempo() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 10, 8, 30);
		
		Duration duracao = Duration.between(data1, data2);
		
		long diffHours = duracao.toHours();
		long diffDays = duracao.toDays();
		
		System.out.println("************************");
		System.out.println("Diferenša entre horas: " + diffHours);
		System.out.println("Diferenša entre dias: " + diffDays);
		
	}
	
	public static void diferencaDataJava8ComChronoUnit() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);
		
		long diff = ChronoUnit.HOURS.between(data1, data2);
		long diffDias = ChronoUnit.DAYS.between(data1, data2);
		
		System.out.println("Diferenša entre horas: " + diff);
		System.out.println("Diferenša entre dias: " + diffDias);
		
	}

}
