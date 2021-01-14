package HashMap;

public class Telefone {

	private TipoTelefone tipo;
	private String numero;

	public Telefone() {

	}

	public Telefone(TipoTelefone tipo, String numero) {
		super();
		this.tipo = tipo;
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [tipo=" + tipo + ", numero=" + numero + "]";
	}

}
