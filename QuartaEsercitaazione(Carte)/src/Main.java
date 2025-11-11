import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Gioco gioco = new Gioco("Lupus in Fabula");
		
		Eroe e1 = new Eroe("Luca");
		Vampiro v1 = new Vampiro("Stefan");
		Licantropo l1 = new Licantropo("Mariagrazia");

		
		gioco.add(e1);
		gioco.add(v1);
		gioco.add(l1);
		
		e1.combatti();
		e1.combatti();
		e1.combatti();
		
		v1.azzanna();
		
		l1.combatti();
		gioco.setNotteDiLunaPiena();		//simulazione notte di luna piena
		l1.combatti	();				//Controllo che corregge combatti in azzanna
		
		gioco.riepilogo();
	}

}
