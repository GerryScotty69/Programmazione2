
public class Sala {

	private String nome;
	private int capienza_disponibile;
	
	public Sala(String nome, int capienza_disponibile) {
		this.nome = nome;
		this.capienza_disponibile = capienza_disponibile;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCapienza_disponibile() {
		return capienza_disponibile;
	}

	public void setCapienza_disponibile(int capienza_disponibile) {
		this.capienza_disponibile = capienza_disponibile;
	}
}
