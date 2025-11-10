
public class Film {
	
	private String titolo;
	private int durata;
	private String genere;
	
	public Film(String titolo, int durata, String genere) {
		this.titolo = titolo;
		this.durata = durata;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	

}
