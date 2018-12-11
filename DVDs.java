
public class DVDs extends Magazines {
	
	public String title;

	public DVDs(int number, String title) {
		super(number, title);
		this.title = title;
	}
	
	public String toString() {
        return ("Item number: " + getNumber() + " - Title: " + getTitle() + " - Status: " + getStatus());    
    }

}
