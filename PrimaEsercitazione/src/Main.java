
public class Main {
	public static void main(String[] args) {
		
		// ---- Creazione agenzia ----
		Agenzia agenzia = new Agenzia("JavaTravel");
		
		//Creazione viaggi
		Viaggio v1 = new Viaggio("Parigi", 5, 650.0);
		Viaggio v2 = new Viaggio("Roma", 3, 400.0);
		Viaggio v3 = new Viaggio("New York", 7, 1200.0);
		Viaggio v4 = new Viaggio("Firenze", 10, 250.0);
				
		agenzia.aggiungiViaggio(v1);
		agenzia.aggiungiViaggio(v2);
		agenzia.aggiungiViaggio(v3);
		agenzia.aggiungiViaggio(v4);
		
		// ---- Creazione clienti ----
		Cliente c1 = new Cliente("Giulia", "Rossi", "giulia.rossi@gmail.com");
		Cliente c2 = new Cliente("Giulia", "Rossi", "giulia.rossi@gmail.com");
		
		agenzia.aggiungiCliente(c1);
		agenzia.aggiungiCliente(c2);
		
		agenzia.mostraViaggi();
		
		// ---- Creazione prenotazioni ----
		Prenotazione p1 = agenzia.creaPrenotazione(c1, v1, 2);
		Prenotazione p2 = agenzia.creaPrenotazione(c2, v3, 1);
		
		//Stampa dettagli prenotazioni
		p1.stampaPrenotazione(p1);
		p2.stampaPrenotazione(p2);
	}
}
