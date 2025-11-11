
public class Cliente {

	//Dichiarazione variabili 
	private String nome;
	private String cognome;
	private String email;
	
	//Costruttore
	public Cliente(String nome, String cognome, String email){
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}
	
	//Metodi
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String newNome) {
		nome = newNome;
	}
	
	public void setCognome(String newCognome) {
		cognome = newCognome;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
}
