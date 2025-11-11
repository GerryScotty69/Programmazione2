
public class Prenotazione {
	
	//definizione variabili
	private int numeroPersone;
	private Cliente cliente;
	private Viaggio viaggio;
	private double costoTotale;
	
	//costruttore
	public Prenotazione(Cliente cliente, Viaggio viaggio, int numeroPersone) {
		this.cliente = cliente;
		this.viaggio = viaggio;
		this.numeroPersone = numeroPersone;
		costoTotale = this.viaggio.getPrezzoPersona() * this.numeroPersone;
	}
	
	//getter e setter
	public int getNumeroPersone() {
		return numeroPersone;
	}
	
	public double getCostoTotale() {
		return costoTotale;
	}
	
	public void setNumeroPersone(int numeroPersone) {
		this.numeroPersone = numeroPersone;
	}
	
	//stampa dettagli prenotazione
	public void stampaPrenotazione(Prenotazione p){
		System.out.println("La prenotazione con meta: " + viaggio.getDestinazione() + " ha " + p.numeroPersone + " persone prenotate con costo totale di " + p.costoTotale);
	}
}
