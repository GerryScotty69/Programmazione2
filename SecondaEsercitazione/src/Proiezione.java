
public class Proiezione {
	private Film film;
	private Sala sala;
	private String data;
	private String orario;
	private int bigliettiVenduti;
	
	public Proiezione(Film film, Sala sala, String orario, String data, int bigliettiVenduti) {
		this.film = film;
		this.sala = sala;
		this.data = data;
		this.orario = orario;
		this.bigliettiVenduti = bigliettiVenduti;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getOrario() {
		return orario;
	}

	public void setOrario(String orario) {
		this.orario = orario;
	}

	public int getBigliettiVenduti() {
		return bigliettiVenduti;
	}

	public void setBigliettiVenduti(int bigliettiVenduti) {
		this.bigliettiVenduti = bigliettiVenduti;
	}

	public double calcolaPercentualeOccupazioneSala(Sala sala) {
		double percentuale = (double) (getBigliettiVenduti() *100) /  sala.getCapienza_disponibile();
		return percentuale;
	}
	
	public void stampaPrenotazione() {
		System.out.print("---------- Dettagli Prenotazione ---------- \n" + 
						"Titolo: " + film.getTitolo() + "\n" +
						"Sala: " + sala.getNome() + "\n" + 
						"Data: " + getData() + "\n" + 
						"Orario: " + getOrario() + "\n");
		System.out.printf("Percentuale di riempimento sala: %.2f%%", calcolaPercentualeOccupazioneSala(sala));
		System.out.println("\n");
	}
	
}
