
public class LibraryMain {

	public static void main(String[] args) {
		
		Library book1 = new Books (10, "I'm a book title");
		Library dvd1 = new DVDs (251, "I'm a movie title");
		Library mag1 = new Magazines (21, "I'm a magazine title");
		
		System.out.println(book1);
		System.out.println(dvd1);
		System.out.println(mag1);

	}

}
