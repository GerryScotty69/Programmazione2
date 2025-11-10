
public class Consegna {
	private String stato;
	private String dimensione;
	private String tipologia;
	
	public Consegna(String dimensione, String tipologia) {
		this.dimensione = dimensione;
		this.tipologia = tipologia;
		stato = "in elaborazione";	//la consegna non è stata assegnata ancora a nessuno
		
	}
	
	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public String getDimensione() {
		return dimensione;
	}

	public void setDimensione(String dimensione) {
		this.dimensione = dimensione;
	}

	
}
