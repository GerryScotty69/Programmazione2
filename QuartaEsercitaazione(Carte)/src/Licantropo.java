
public class Licantropo implements Umano, Mostro{
	
	private int forzaUmano;
	private int forzaMostro;
	private String nome;
	private boolean isUmano;
	
	public Licantropo(String nome) {
		this.nome = nome;
		forzaUmano = 10;
		forzaMostro = 15;
		isUmano = true;
	}
	
	public void combatti() {
		if(getIsUmano()) {
			setForzaUmano(getForzaUmano() - 3); 
			System.out.println("Eroe " + getNome() + " combatte\n");
		}else {
			azzanna();
		}
	}
	
	public void azzanna() {
		if(getIsUmano()) {
			combatti();
		}else {
			setForzaMostro(getForzaMostro() - 2);
			System.out.println("Vampiro " + getNome() + " azzanna\n");

		}
	}
	
	public int getForza() {
		if(getIsUmano()) {
			System.out.println("|Forza Umano: " + getForzaUmano());
			System.out.println("|Forza Mostro: " + getForzaMostro());
			return getForzaUmano();
		}else {
			System.out.println("|Forza Umano: " + getForzaUmano());
			System.out.println("|Forza Mostro: " + getForzaMostro());
			return getForzaMostro();
		}
	}
	
	public void setIsUmano(boolean b) {
		isUmano = b;
	}
	
	public boolean getIsUmano() {
		return isUmano;
	}
	
	public int getForzaUmano() {
		return forzaUmano;
	}

	public void setForzaUmano(int forzaUmano) {
		this.forzaUmano = forzaUmano;
	}

	public int getForzaMostro() {
		return forzaMostro;
	}

	public void setForzaMostro(int forzaMostro) {
		this.forzaMostro = forzaMostro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
