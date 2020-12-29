package cursojava.aula33.exercicio01;

public class Lampada {
	
	private boolean status;
	
	public Lampada() {
		setStatus(true);
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void ligarDesligarLampada() {
		this.status = !getStatus();
	}
	
	public void exibirStatus() {
		if(getStatus()) {
			System.out.println("Status: ligada");
		} else {
			System.out.println("Status: desligada");
		}
	}
}
