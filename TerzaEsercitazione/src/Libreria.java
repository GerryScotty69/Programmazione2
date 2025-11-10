
public class Libreria {
	private String nomeLibreria;
	private Item[] items;
	private int numItems;
	private static final int maxItems = 100;
	
	public Libreria(String nomeLibreria) {
		this.nomeLibreria = nomeLibreria;
		this.items = new Item[maxItems];
		numItems = 0;
	}
	
	public void add(Item item) {
		if(numItems < maxItems) {
			items[numItems++] = item;
		}else {
			System.out.println("Impossibile aggiungere oggetti alla libreria");
		}
	}
	
	public Item searchTitle(String title) {
		for(int i = 0; i < numItems; i++) {
			if(items[i].getTitle().equalsIgnoreCase(title)) {
				return items[i];
			}
		}
		return null;
	}
	
	public String getNomeLibreria() {
		return nomeLibreria;
	}

	public void setNomeLibreria(String nomeLibreria) {
		this.nomeLibreria = nomeLibreria;
	}

	public Item[] getItems() {
		return items;
	}

	public int getNumItems() {
		return numItems;
	}

	public Item searchId(String id) {
		for(int i = 0; i < numItems; i++) {
			if(items[i].getId().equalsIgnoreCase(id)) {
				return items[i];
			}
		}
		return null;
	}
}
