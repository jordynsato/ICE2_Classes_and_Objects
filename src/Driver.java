import java.util.ArrayList;

public class Driver {

	private static ArrayList<Book> library = new ArrayList<Book>();
	
	public static void main(String[] args) {
		/*  --test info--
		Book sth1 = new Book("Title", "Author", "Jan 2018");
		addBook(sth1);
		
		Book sth2 = new Book("Start", "Ar", "Mar 2018");
		addBook(sth2);
		
		Book sth3 = new Book("read", "adsf", "Apr 2018");
		addBook(sth3);
		
		Book sth4 = new Book("read", "brb", "Apr 2018");
		addBook(sth4);
		
		displayLibrary();
		*/
	}
	
	public static void addBook(Book b) {
		if (library.size()== 0)
			library.add(0,b);
		
		else {
			for (int i = 0; i < library.size();i++) {
				if(b.getTitle().compareToIgnoreCase(library.get(i).getTitle()) < 0 )
				{
					library.add(i, b);
					break;
				}
				else if(b.getTitle().compareTo(library.get(i).getTitle() )== 0) {
					if (b.getAuthor().compareTo(library.get(i).getAuthor()) < 0)
					{
						library.add(i, b);
						break;
					}
					else
						continue;
				}
				else
				{
					library.add(b);
				}
			
			}
			
		}
	}
	
	public static void displayLibrary() {
		System.out.printf("This is your library of %d books: \n", library.size());
		for (Book b: library) {
			System.out.println("Title: " + b.getTitle());
			System.out.println("Author: " + b.getAuthor());
			System.out.println("Publication Date: " + b.getPublicationDate() + "\n");
			}
		
	}

}
