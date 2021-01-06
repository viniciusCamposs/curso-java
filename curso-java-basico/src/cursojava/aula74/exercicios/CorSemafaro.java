package cursojava.aula74.exercicios;

public enum CorSemafaro {
	VERDE(1000), AMARELO(300), VERMELHO(2000);

	private int tempoEspera;

	public int getTempoEspera() {
		return tempoEspera;
	}

	public void setTempoEspera(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

	CorSemafaro(int tempoEspera) {
		this.tempoEspera = tempoEspera;
	}

}
