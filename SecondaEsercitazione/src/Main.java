
public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema("Gaveli");
		
		Sala s1 = new Sala("Prima sala", 150);
		Sala s2 = new Sala("Seconda sala", 200);
		
		cinema.aggiungiSala(s1);
		cinema.aggiungiSala(s2);
		
		
		Film f1 = new Film("Batman", 120, "Fantasy");
		Film f2 = new Film("Passenger", 100 ,"Avventura");
		
		cinema.aggiungiFilm(f1);
		cinema.aggiungiFilm(f2);

		Proiezione p1 = new Proiezione(f1,s1,"20:30","12/10/2025", 100);
		Proiezione p2 = new Proiezione(f2,s2, "19:30", "20/10/2026", 180);
		
		cinema.nuovaProiezione(p1);
		cinema.nuovaProiezione(p2);
		
		cinema.mostraTutteLeProiezioni();
		
		cinema.mostraCatalogo();
			
	}

}
