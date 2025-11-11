import java.util.Date;

public class Bonifico extends OperazioneFinanziaria implements Autentica{
	
	private String ibanDestinatario;
	private String bancaDestinatario;
	
	public Bonifico(String id, double importo, String cliente, String ibanDestinatario, String bancaDestinatario) {
		this.id = id;
		this.importo = importo;
		this.cliente = cliente;
		this.ibanDestinatario = ibanDestinatario;
		this.bancaDestinatario = bancaDestinatario;
	}
	
	public void esegui() {
		if(autenticaUtente()) {
			 System.out.println(generaRiepilogo());
		}else {
			System.out.println("ERRORE L'utente non è riuscito ad autenticarsi");
		}
	}
	
	public String generaRiepilogo() {
		String string ="|Bonifico eseguito con successo:\n"  
						+ "|Id: " + id + "\n"
						+ "|Importo: " + importo + "\n"
						+ "|Cliente: " + cliente + "\n"
						+ "|Iban destinatario: " + ibanDestinatario + "\n"
						+ "|Banca destinatario: " + bancaDestinatario;
		return string;
	}
	
	public boolean autenticaUtente() {
		
	}
}
