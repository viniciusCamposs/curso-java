package HashMap;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapMain {
	public static void main(String[] args) {
		Map<String, Object> map2 = new HashMap<>();
		map2.put("id", 0);
		map2.put("nome", "TESTE");
		map2.put("ativo", "S");
		
		List<Map<String, Object>> l_tele = new ArrayList<>();
		Map<String, Object> tele = new HashMap<>();
		tele.put("id", 0);
		tele.put("telefone", "19997866585");
		l_tele.add(tele);
		
		map2.put("pacientextelefone", l_tele);
		
		
		Cliente cl01 = new Cliente("Cliente 01", 1);
		Cliente cl02 = new Cliente("Cliente 02", 2);
		
		
		Telefone tel01 = new Telefone(TipoTelefone.CELULAR, "(19) 98845-1135");
		Telefone tel02 = new Telefone(TipoTelefone.FIXO, "(19) 98845-9999");
		Telefone tel03 = new Telefone(TipoTelefone.CELULAR, "(19) 99999-1135");
		
		ArrayList<Telefone> listaTel01 = new ArrayList<Telefone>();
		listaTel01.add(tel01);
		listaTel01.add(tel02);
		
		
		Map<Cliente, ArrayList<Telefone>> mapa = new HashMap<Cliente, ArrayList<Telefone>>();
		
		mapa.put(cl01, listaTel01);
		
		System.out.println(mapa.get(cl01));
		
		
		
		
	}
}
