
public class Cinema {
	private String nome;
	private Sala[] sale;
	private Film[] catalogo_film;
	private Proiezione[] proiezioni;
	
	private int numSale;
	private int numFilm;
	private int numProiezione;
	
	private static final int MAX_SALE = 100;
	private static final int MAX_FILM = 1000;
	private static final int MAX_PROIEZIONI = 1000;
	
	
	public Cinema(String nome) {
		this.nome = nome;
		sale = new Sala[MAX_SALE];
		catalogo_film = new Film[MAX_FILM];
		proiezioni = new Proiezione[MAX_PROIEZIONI];
		numSale = 0;
		numFilm = 0;
		numProiezione = 0;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void aggiungiSala(Sala s) {
		if(numSale < MAX_SALE) {
			sale[numSale++] = s;
		}else {
			System.out.println("Impossibile aggiungere sale, numero massimo raggiunto");
		}
	}

	public void aggiungiFilm(Film f) {
		if(numFilm < MAX_FILM) {
			catalogo_film[numFilm++] = f;
		}else {
			System.out.println("Impossibile aggiungere film al catalogo, numero massimo raggiunto");
		}
	}

	public void nuovaProiezione(Proiezione p) {
		if(numProiezione < MAX_PROIEZIONI) {
			proiezioni[numProiezione++] = p;
		}else {
			System.out.println("Impossibile aggiungere proiezioni, numero massimo raggiunto");
		}
	}

	public void mostraTutteLeProiezioni() {
		for(Proiezione p : proiezioni) {
			if(p != null) {
				p.stampaPrenotazione();
			}
		}
		
	}
	
	public void mostraCatalogo() {
		System.out.println("---------- Catalogo FILM ----------");
		for (int i = 0; i < numFilm; i++) {
			System.out.printf("%d) ", i);
			System.out.print(catalogo_film[i].getTitolo() + "\n");
		}
	}
}
