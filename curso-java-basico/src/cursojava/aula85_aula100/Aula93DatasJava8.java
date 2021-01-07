package cursojava.aula85_aula100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Aula93DatasJava8 {
	public static void main(String[] args) {
		// data dd MM yyyy
		//LocalDate agora = LocalDate.now();
		//System.out.println(agora);
		
		//System.out.println(LocalDate.of(2019, 2, 1));
		//System.out.println(LocalDate.parse("2019-12-31"));
		
		//System.out.println(agora.plusDays(30));
		//System.out.println(agora.minusDays(30));
		
		//System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		//System.out.println(agora.plus(1, ChronoUnit.MONTHS));
		
		//System.out.println(agora.getDayOfYear());
		
		//System.out.println(LocalDate.parse("2012-12-31").isLeapYear());
		
		//LocalTime horario = LocalTime.now();
		
		//System.out.println(horario);
		
		//System.out.println(LocalTime.of(20, 18));
		//System.out.println(LocalTime.parse("20:18").plusHours(2));
		//System.out.println(horario.plusMinutes(50));
		//System.out.println(horario.minus(20, ChronoUnit.MINUTES));
		
		// data completa = data + hora
		//LocalDateTime agoraCompleto = LocalDateTime.now();
		//System.out.println(agoraCompleto);
		
		//System.out.println(LocalDateTime.of(2019, 2, 16, 20, 25, 10));
		//System.out.println(agoraCompleto.minus(2, ChronoUnit.YEARS));
		
		//ZoneId fuso = ZoneId.systemDefault();
		//System.out.println(fuso);
		
		/*Set<String> fusos = ZoneId.getAvailableZoneIds();
		for(String f : fusos) {
			System.out.println(f);
		}*/
		
		ZoneId monaco = ZoneId.of("Europe/Monaco");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), monaco);
		
		System.out.println(zdt);
		
		
			
	}
}
