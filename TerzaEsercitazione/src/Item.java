
public abstract class Item {
	protected String titolo;
	protected String id;
	
	
	
	public String getTitle() {
		return titolo;
	}
	public void setTitle(String titolo) {
		this.titolo = titolo;
	}
	public String getId() {
		return id;
	}
	
	public abstract String getDetails();
}
