package cursojava.aula85_aula100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();

		// System.out.println(locale);

		Locale[] locales = Locale.getAvailableLocales();

		for (Locale loc : locales) {
			System.out.println("Nome: " + loc);
			System.out.println("C�digo da l�ngua: " + loc.getLanguage());
			System.out.println("L�ngua: " + loc.getDisplayLanguage());
			System.out.println("Cod Pa�s: " + loc.getCountry());
			System.out.println("Pa�s: " + loc.getDisplayCountry());
			System.out.println("*************************");
		}

		/*
		 * Locale br = new Locale("pt_BR", "Brazil");
		 * 
		 * System.out.println(br);
		 * 
		 * Locale.setDefault(br);
		 */

		System.out.println(Locale.getDefault());
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALIAN);
		System.out.println(nf2.format(5000));

	}
}
