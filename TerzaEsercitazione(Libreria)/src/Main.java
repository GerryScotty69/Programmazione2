
public class Main {

	public static void main(String[] args) {
		Libreria libreria = new Libreria("La libreria di Pippo Baudo");
		
		Libro l1 = new Libro("01", "La ricerca di nemo", "Marco", 277);
		
		libreria.add(l1);
		
		Cd c1 = new Cd("02", "Ogni volta", "Vasco Rossi", 10);
		
		libreria.add(c1);
		
		Dvd d1 = new Dvd("03", "Inception", "Christopher Nolan", 150);
		
		libreria.add(d1);
		
		
		
		Item i = libreria.searchTitle("Ogni volta");
		
		if(i != null) {
			System.out.println(i.getDetails());
		}else {
			System.out.println("Oggetto non trovato");
		}
		
		
		
		Item i2 = libreria.searchId("02");
		
		if(i2 != null) {
			System.out.println(i2.getDetails());
		}else {
			System.out.println("Oggetto non trovato");
		}
		
	}

}
