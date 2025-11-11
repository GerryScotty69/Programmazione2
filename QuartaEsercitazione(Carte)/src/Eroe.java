
public class Eroe implements Umano{
	private int forza;
	private String nome;
	
	public Eroe(String nome) {
		this.nome = nome;
		forza = 10;
	}
	
	public void combatti() {
		setForza(forza- 3);
		System.out.println("Eroe " + getNome() + " combatte\n");
	}

	public int getForza() {
		System.out.println("|Forza: " + forza);
		return forza;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
