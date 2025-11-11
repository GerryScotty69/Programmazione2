
public class Libro extends Item{
	private String autore;
	private int numeroPagine;
	
	public Libro(String id, String titolo, String autore, int numeroPagine) {
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.numeroPagine = numeroPagine;
		
	}
	
	
	public String getDetails() {
		return "ID: " + this.id +"| Title" + this.titolo + "|Autore: " + this.autore + "|Numero pagine" + this.numeroPagine; 
	}

	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
}
