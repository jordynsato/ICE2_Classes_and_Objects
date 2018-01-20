import java.util.ArrayList;
import java.util.Scanner;

/*
 * This class runs the program by asking for user input on a book's title, author, and publication date.
 * The user can enter multiple books, but at the end displays a list of all the books in alphabetical
 * order by title.
 * 
 * Authors: Serena Ing, Nana Mimura, Jordyn Sato
 * Last Update: 1/19/18 at 5:43 PM
 */
public class Driver {

	//Fields
	private static ArrayList<Book> library = new ArrayList<Book>();


	//Methods
	/**
	 * Adds a book to the library database based on its title.
	 * 
	 * @param b Book to be added to the library.
	 */
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

	/**
	 * Writes out the list of all the books in the library database.
	 */
	public static void displayLibrary() {
		System.out.printf("This is your library of %d books: \n", library.size());
		for (Book b: library) {
			System.out.println("Title: " + b.getTitle());
			System.out.println("Author: " + b.getAuthor());
			System.out.println("Publication Date: " + b.getPublicationDate() + "\n");
		}
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> 67615fd9215a82d96f75091f39e496bf892da8fb

					System.out.println("Please enter the month and year the book was published, with the month written" + 
							" out and the year as a number: ");
					String publication = scan.nextLine();

					Book newBook = new Book(title, author, publication);

					addBook(newBook);

					System.out.println("Would you like to add another book?(Y/N): ");
					if (!scan.hasNextLine())
						System.out.println("Thank you for using this program. Goodbye.");
					else {
						addNewBook = scan.nextLine();
						if (!addNewBook.equalsIgnoreCase("Y")) {
							addNewBook = "N";
							displayLibrary();
							System.out.println("Thank you for using this program. Goodbye.");
						}
					}
				}
			}
		}

	}
}
