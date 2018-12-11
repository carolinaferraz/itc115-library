
public class CDs extends DVDs {

	public String title;
	
	public CDs(int number, String title) {
		super(number, title);
		this.title = title;
	}

	public String toString() {
        return ("Item number: " + getNumber() + " - Title: " + getTitle() + " - Status: " + getStatus());    
    }
}
