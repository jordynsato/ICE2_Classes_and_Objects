import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

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
  
	//ArrayList<Book> library = displayAllBooks();
    
	}
}
