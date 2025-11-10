
public class Partita {
	
	private String avversario;
	private int gol_segnati;
	private int gol_subiti;

	public Partita(String avversarsio, int gol_segnati, int gol_subuti) {
		this.avversario = avversarsio;
		this.gol_segnati = gol_segnati;
		this.gol_subiti = gol_subuti;
	}

	public String getAvversario() {
		return avversario;
	}

	public void setAvversario(String avversario) {
		this.avversario = avversario;
	}

	public int getGol_segnati() {
		return gol_segnati;
	}

	public void setGol_segnati(int gol_segnati) {
		this.gol_segnati = gol_segnati;
	}

	public int getGol_subiti() {
		return gol_subiti;
	}

	public void setGol_subiti(int gol_subiti) {
		this.gol_subiti = gol_subiti;
	}
}
