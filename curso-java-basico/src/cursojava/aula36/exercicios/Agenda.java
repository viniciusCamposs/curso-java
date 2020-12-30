package cursojava.aula36.exercicios;

public class Agenda {
	private Contato[] contatos;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String retornaContatos(Contato[] contatos, int indice) {
		return contatos[indice].getNome() + " \n" + contatos[indice].getEmail() + " \n" + contatos[indice].getTelefone();
	}
	
	public String retornaTodosContatos(Contato[] contatos) {
		String informacoes = "";
		for(int i=0; i<contatos.length; i++) {
			informacoes += contatos[i].getNome() + " \n" + contatos[i].getEmail() + " \n" + contatos[i].getTelefone() + " \n";
		}
		
		return informacoes;
	}
	
}
