
public class Magazines extends Books {
	
	public String title;
	
	public Magazines (int number, String title) {
		super(number, title);
		this.title = title;
	}
	
	public String toString() {
        return ("Item number: " + getNumber() + " - Title: " + getTitle() + " - Status: " + getStatus());    
    }

}