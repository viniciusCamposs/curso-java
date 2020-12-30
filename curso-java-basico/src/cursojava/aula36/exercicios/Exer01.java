package cursojava.aula36.exercicios;

public class Exer01 {
	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
		agenda.setNome("Agenda de fim de ano");
		
		Contato contato01 = new Contato();
		contato01.setNome("Aristoteles");
		contato01.setEmail("aristoteles@email.com");
		contato01.setTelefone("(19) 99999-9999");
		
		Contato contato02 = new Contato();
		contato02.setNome("Platao");
		contato02.setEmail("platao@email.com");
		contato02.setTelefone("(21) 88888-8888");
		
		Contato[] contatos = new Contato[2];
		
		contatos[0] = contato01;
		contatos[1] = contato02;
		
		agenda.setContatos(contatos);
	
		
		System.out.println(agenda.retornaTodosContatos(contatos));
		
	}
}
