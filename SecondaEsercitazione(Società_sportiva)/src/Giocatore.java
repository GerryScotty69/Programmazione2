
public class Giocatore {
	private String nome;
	private String cognome;
	private String ruolo;
	private int numeroMaglia;

	public Giocatore(String nome, String cognome, String ruolo, int numeroMaglia) {
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.numeroMaglia = numeroMaglia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public int getNumeroMaglia() {
		return numeroMaglia;
	}

	public void setNumeroMaglia(int numeroMaglia) {
		this.numeroMaglia = numeroMaglia;
	}
	
	
}
