
public class Viaggio {
	
	private String destinazione;
	private int durataGiorni;
	private double prezzoPersona;
	
	//Costruttore
	public Viaggio(String destinazione, int durataGiorni, double prezzoPersona){
		this.destinazione = destinazione;
		this.durataGiorni = durataGiorni;
		this.prezzoPersona = prezzoPersona;
	}
	
	
	//Metodi Get
	public String getDestinazione() {
		return this.destinazione;
	}
	
	public int getDurataGiorni() {
		return this.durataGiorni;
	}
	
	public double getPrezzoPersona() {
		return this.prezzoPersona;
	}
	
	//Metodi Set
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	
	public void setDurataGiorni(int durataGiorni) {
		this.durataGiorni = durataGiorni;
	}
	
	public void setPrezzoPersona(double prezzoPersona) {
		this.prezzoPersona = prezzoPersona;
	}
	
	public void stampaDettagli(){
		System.out.println("Il viaggio è diretto a " + destinazione + " per " + durataGiorni + " giorni per un prezzo di " + prezzoPersona + " per cliente");
	}
}
