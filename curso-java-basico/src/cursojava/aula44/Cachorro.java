package cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {
	private int tamanho;
	private String ra�a;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
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
