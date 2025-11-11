
public class Vampiro implements Mostro{
	
	private int forza;
	private String nome;
	
	public Vampiro(String nome) {
		this.nome = nome;
		forza = 15;
	}
	
	public void azzanna() {
		setForza(forza - 2);
		System.out.println("Vampiro " + getNome() + " azzanna\n");
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
