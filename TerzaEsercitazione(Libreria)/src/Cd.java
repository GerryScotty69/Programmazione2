
public class Cd extends Item{
	private String artista;
	private int tracce;
	
	public Cd(String id, String titolo, String artista, int tracce) {
		this.id = id;
		this.titolo = titolo;
		this.artista = artista;
		this.tracce = tracce;
	}
	
	public String getDetails() {
		return "ID: " + this.id +"| Title" + this.titolo + "|Artista: " + this.artista + "|Numero tracce" + this.tracce; 

	}
	

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getTracce() {
		return tracce;
	}

	public void setTracce(int tracce) {
		this.tracce = tracce;
	}
	
	
	
}
