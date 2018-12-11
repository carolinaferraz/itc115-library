//Library superclass

public abstract class Library {
	
	private int number; //item number
	public String title;
	public String status;
	
	
	
    public Library(int number, String title) {
    	this.number = number;
    	this.title = title;
    	}
    
    public int getNumber() {
    	return number;
    	}
    
    public String getTitle() {
    	return title;
    	
    }
    public String getStatus() {  //status will depend on item number
        if(number == 10)
       	return "reserved";
        if(number < 50)
       	return "check in"; // available
        if(number >= 50) 
       	return "checked out";
        
        else
       	return "pay fines";
    }
    
    public abstract String toString();
}
