package cursojava.aula85_aula100;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {
	public static void main(String[] args) {

		String padrao = "###,###.##";
		DecimalFormat df = new DecimalFormat(padrao);

		System.out.println(df.format(123467890.123));

		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');

		String padrao2 = "###,###.##";
		df = new DecimalFormat(padrao2, dfs);
		df.setGroupingSize(3);
		System.out.println(df.format(123467890.123));

	}
}
