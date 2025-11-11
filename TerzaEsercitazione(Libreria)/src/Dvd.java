
public class Dvd extends Item{
	
	private String regista;
	private int durata;
	
	public Dvd(String id, String titolo, String regista, int durata) {
		this.id = id;
		this.titolo = titolo;
		this.regista = regista;
		this.durata = durata;
	}
	
	public String getDetails() {
		return "ID: " + this.id +"| Title" + this.titolo + "|Regista: " + this.regista + "|Durata" + this.durata; 

	}}
