package cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {
	private int tamanho;
	private String raça;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub

	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub

	}

}
