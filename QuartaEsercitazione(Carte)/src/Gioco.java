public class Gioco {
	
	private String nome;
	Personaggio[] personaggi;
	
	private int numPersonaggi;
	
	static final int MAXPERSONAGGI = 100;
	
	public Gioco(String nome) {
		this.nome = nome;
		this.personaggi = new Personaggio[MAXPERSONAGGI];
		numPersonaggi = 0;
	}
	
	public void add(Personaggio p) {
		if(numPersonaggi <= MAXPERSONAGGI) {
			personaggi[numPersonaggi++] = p;
		}else {
			System.out.println("ERRORE Limite di personaggi raggiunto");
		}
	}
	
	public void riepilogo() {
		System.out.println("~~~~~~~~~~ RIEPILOGO FORZA FISICA ~~~~~~~~~~~");
		for(int i = 0; i < numPersonaggi; i ++) {
			System.out.println("|" + personaggi[i].getClass().getName() + ": " + personaggi[i].getNome());
			personaggi[i].getForza();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
	
	public void setNotteDiLunaPiena() {
		for(int i = 0; i < numPersonaggi; i++) {
			if(personaggi[i].getClass().getName().equalsIgnoreCase("Licantropo")) {
				Licantropo l = (Licantropo)personaggi[i];
				l.setIsUmano(false);
				personaggi[i] = (Personaggio)l;
			}
		}
	}
}
