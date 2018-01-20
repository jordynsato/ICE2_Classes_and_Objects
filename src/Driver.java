import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	private static ArrayList<Book> library = new ArrayList<Book>();
	
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

        public static void main(String[] args) {
  
                Scanner scan = new Scanner(System.in);
  
                System.out.println("Hello, welcome to the library database.");
                System.out.println("Would you like to add a new book to the database?(Y/N): ");
                String addNewBook = "";
                if (!scan.hasNextLine())
                        System.out.println("Thank you for using this program. Goodbye.");
                else {
                        addNewBook = scan.nextLine();
                        if (!addNewBook.equalsIgnoreCase("Y"))
                                System.out.println("Thank you for using this program. Goodbye.");
                        else {
                                while (addNewBook.equalsIgnoreCase("Y")) {
                                        System.out.println("Please enter the title of the book: ");
                                        String title = scan.nextLine();
  
                                        System.out.println("Please enter the author of the book: ");
                                        String author = scan.nextLine();
  
                                        System.out.println("Please enter the month and year the book was published, with the month written" + 
                                                           " out and the year as a number: ");
                                        String publication = scan.nextLine();
  
                                        Book newBook = new Book(title, author, publication);
    
                                        System.out.println("Would you like to add another book?(Y/N): ");
                                        if (!scan.hasNextLine())
                                                System.out.println("Thank you for using this program. Goodbye.");
                                        else {
                                                addNewBook = scan.nextLine();
                                                if (!addNewBook.equalsIgnoreCase("Y")) {
                                                        addNewBook = "N";
                                                        System.out.println("Thank you for using this program. Goodbye.");
                                                }
                                        }
                                }
                        }
                }
	scan.close();

        }
}
