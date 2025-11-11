
public class Main {

	public static void main(String[] args) {
		GestoreOperazioni gestore = new GestoreOperazioni("Fintech");
		
		Ricarica r1 = new Ricarica("");
		PagamentoCarta pc1 = new PagamentoCarta("");
		Bonifico b1 = new Bonifico("");
		Prelievo p1 = new Prelievo("");
		
		gestore.add(r1, pc1, b1, p1);
		gestore.eseguiTutte();
		gestore.stampaRiepilogo();
		

	}

}
