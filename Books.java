
public class Books extends Library {
	
	public String title; 
	
	
	public Books (int number, String title) {
		super(number, title);
		this.title = title;
	}
    
    public String toString() {
        return ("Item number: " + getNumber() + " - Title: " + getTitle() + " - Status: " + getStatus());    
    }

}
