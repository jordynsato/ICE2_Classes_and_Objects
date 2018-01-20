/*
 * This class creates a Book object that contain a title, author, and publication date.
 * All of which can be seen via String form.
 * 
 * Authors: Serena Ing, Nana Mimura, Jordyn Sato
 * Last Update: 1/19/18 at 5:42 PM
 */
public class Book {

	//Fields
	private String title, author, publicationDate;

	//Constructors
	/**
	 * This creates a book with an empty title, author, and publication date.
	 */
	public Book() {
		title = "";
		author = "";
		publicationDate = "";
	}

	/**
	 * This creates a book with title t, author a, and publication date p.
	 * 
	 * @param t The title of the book.
	 * @param a The author of the book.
	 * @param p The publication date of the book.
	 */
	public Book(String t, String a, String p) {
		title = t;
		author = a;
		publicationDate = p;
	}

	//Methods
	/**
	 * This method returns the title of the book.
	 * 
	 * @return The title of the book.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method returns the author of the book.
	 * 
	 * @return The author of the book.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * This method returns the publication date of the book.
	 * 
	 * @return The publication date of the book.
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * This method sets the title of the book.
	 * 
	 * @param t New title of the book.
	 */
	public void setTitle(String t) {
		title = t;
	}

	/**
	 * This method sets the author of the book.
	 * 
	 * @param a New author of the book.
	 */
	public void setAuthor(String a) {
		author = a;
	}

	/**
	 * This method sets the publication date of the book.
	 * 
	 * @param p New publication date of the book.
	 */
	public void setPublicationDate(String p) {
		publicationDate = p;
	}

	/**
	 * This method returns the String form of a Book.
	 * 
	 * @return Gives the title, author, and publication date of the book.
	 */
	public String toString() {
		return title + " by " + author + " was published on " + publicationDate + ".";
	}
}
