
public class Main {

	public static void main(String[] args) {
		SocSport socSport = new SocSport("Haas_Fc");
		
		Giocatore g1 = new Giocatore("Pecco","Bagnaia", "attaccante", 63);
		Giocatore g2 = new Giocatore("Sergio", "Perez", "difensore" , 11);
		Giocatore g3 = new Giocatore("Charles", "Leclerc", "centro campista", 16);
		Giocatore g4 = new Giocatore("Fernando", "Alonso", "portiere", 14);
		
		socSport.aggiungiGiocatore(g1,g2,g3,g4);
		
		Partita p1 = new Partita("Mclaren_FC", 4 , 3);
		Partita p2 = new Partita("Red_Bull", 1, 2);
		Partita p3 = new Partita("Ferrari", 0, 0);
		Partita p4 = new Partita("Yamaha", 2, 4);
		Partita p5 = new Partita("Honda", 3, 2);

		
		socSport.aggiungiPartita(p1);
		socSport.aggiungiPartita(p2, p3, p4, p5);
		
		socSport.calcolaRisultati();
		
		socSport.mostraInfSquadra();
		socSport.mostraInfGiocatori();
		
		socSport.mostraRendimentoComplessivo();
				
	}

}
