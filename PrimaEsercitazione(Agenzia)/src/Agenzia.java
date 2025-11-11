
public class Agenzia {
	
	private String nome;
	private Viaggio[] viaggi;
	private Cliente[] clienti;
	private Prenotazione[] prenotazioni;
	
	private int numViaggi;
	private int numClienti;
	private int numPrenotazioni;
	
	private static final int MAX_VIAGGI = 100;
	private static final int MAX_CLIENTI = 100;
	private static final int MAX_PRENOTAZIONI = 1000;
	
	//Costruttore
	public Agenzia(String nome){
		this.nome = nome;
		viaggi = new Viaggio[MAX_VIAGGI];
		clienti = new Cliente[MAX_CLIENTI];
		prenotazioni = new Prenotazione[MAX_PRENOTAZIONI];
		this.numViaggi = 0;
		this.numClienti = 0;
		this.numPrenotazioni = 0;
	}

	public void aggiungiViaggio(Viaggio v){
		//aggiungiamo viaggio alla lista viaggi disponibili
		if(numViaggi < viaggi.length) {
			viaggi[numViaggi++] = v;
		} else {
			System.out.println("Impossibile aggiungere: lista viaggi piena");
		}
	}
	
	public void aggiungiCliente(Cliente c) {
		//Aggiungi cliente alla lista clienti
		if(numClienti < clienti.length) {
			clienti[numClienti++] = c;
		} else {
			System.out.println("Impossibile aggiungere: lista clienti piena");
		}
	}
	
	public Prenotazione creaPrenotazione(Cliente c, Viaggio v, int numPersone) {
		//Creazione prenotazione 
		if(numPrenotazioni < prenotazioni.length) {
			Prenotazione p = new Prenotazione(c, v, numPersone);
			prenotazioni[numPrenotazioni++] = p;
			return p;
		} else {
			System.out.println("Impossibile creare prenotazione: lista piena");
			return null;
		}
	}
	
	public void mostraViaggi() {
		System.out.println("\n--- Viaggio disponibili presso " + nome + " ---");
		for(Viaggio v : viaggi) {
			if(v != null) {
				v.stampaDettagli();
			}
		}
	}
	
	//metodi get
	public Viaggio[] getViaggio() {
		return this.viaggi;
	}
	
	public Cliente[] getCliente() {
		return this.clienti;
	}
	
	public Prenotazione[] getPrenotazione() {
		return this.prenotazioni;
	}
}
