
public class SocSport {
	
	
	private String nome;
	private Giocatore[] rosa;
	private Partita[] partite;
	
	private int numGiocatori;
	private int numPartite;
	
	private static final int MAX_GIOCATORI = 40;
	private static final int MAX_PARTITE = 100;
	
	private int vittorie;
	private int pareggi;
	private int sconfitte;
	
	public SocSport(String nome) {
	this.nome = nome;
	rosa = new Giocatore[MAX_GIOCATORI];
	partite = new Partita[MAX_PARTITE];
	numGiocatori = 0;
	numPartite = 0;
	vittorie = 0;
	pareggi = 0;
	sconfitte = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void aggiungiGiocatore(Giocatore g) {
		if(numGiocatori < MAX_GIOCATORI) {
			rosa[numGiocatori++] = g;
		}else {
			System.out.println("Impossibile aggiungere giocatori, rosa al completo!");
		}
	}
	
	public void aggiungiGiocatore(Giocatore g1, Giocatore g2, Giocatore g3, Giocatore g4) {
		if(numGiocatori < MAX_GIOCATORI) {
			rosa[numGiocatori++] = g1;
			rosa[numGiocatori++] = g2;
			rosa[numGiocatori++] = g3;
			rosa[numGiocatori++] = g4;
		}else {
			System.out.println("Impossibile aggiungere giocatori, rosa al completo!");
		}
	}
	
	public void aggiungiPartita(Partita p) {
		if(numPartite < MAX_PARTITE) {
			partite[numPartite++] = p;
		}else {
			System.out.println("Impossibile aggiungere partite, lista piena");
		}
	}
	
	public void aggiungiPartita(Partita p1, Partita p2, Partita p3, Partita p4) {
		if(numPartite < MAX_PARTITE) {
			partite[numPartite++] = p1;
			partite[numPartite++] = p2;
			partite[numPartite++] = p3;
			partite[numPartite++] = p4;
		}else {
			System.out.println("Impossibile aggiungere partite, lista piena");
		}
	}

	public void calcolaRisultati() {		
		for(int i = 0; i < numPartite; i ++) {
			if(partite[i].getGol_segnati() > partite[i].getGol_subiti()) {
				vittorie++;
			}else if(partite[i].getGol_segnati() < partite[i].getGol_subiti()) {
				sconfitte++;
			}else {
				pareggi++;
			}
		}
	}
	
	public void mostraInfSquadra() {
		System.out.println("~~~~~~~~~~ INFORMAZIONI SQUADRA ~~~~~~~~~~");
		System.out.println("Nome squadra: " + getNome());
		System.out.println("Numero giocatori: " + numGiocatori);
		System.out.println("Partite giocate: " + numPartite);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

	}
	
	public void mostraInfGiocatori() {
		for(int i = 0; i < numGiocatori; i++) {
			System.out.println("~~~~~~~~~~ INFORMAZIONI " + rosa[i].getCognome().toUpperCase() +" ~~~~~~~~~~");
			System.out.println("Nome: " + rosa[i].getNome());
			System.out.println("Cognome: " + rosa[i].getCognome());
			System.out.println("Ruolo: " + rosa[i].getRuolo());
			System.out.println("Numero di maglia: " + rosa[i].getNumeroMaglia());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		}
	}
	
	public int getGolSegnati() {
		int golSegnati = 0;
		for(int i = 0; i < numPartite; i++) {
			golSegnati+=partite[i].getGol_segnati();
		}
		return golSegnati;
	}
	
	public int getGolSubiti() {
		int golSubiti = 0;
		for(int i = 0; i < numPartite; i++) {
			golSubiti+=partite[i].getGol_subiti();
		}
		return golSubiti;
	}
	
	public void mostraRendimentoComplessivo() {
		System.out.println("~~~~~~~~~~ RENDIMENTO COMPLESSIVO SQUADRA ~~~~~~~~~~");
		System.out.println("Vittorie: " + vittorie);
		System.out.println("Pareggi: " + pareggi);
		System.out.println("Sconfitte: " + sconfitte);
		System.out.println("Gol segnati: " + getGolSegnati());
		System.out.println("Gol subiti: " + getGolSubiti());
	}

	
	
	
	
	

}
