package HashMap;

import java.util.Map;
import java.util.HashMap;

public class HashMapMain {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(1, "Valor 1");
		mapa.put(2, "Valor 2");
		mapa.put(3, "Valor 3");
		
		System.out.println(mapa.get(1));
		
		
	}
}
