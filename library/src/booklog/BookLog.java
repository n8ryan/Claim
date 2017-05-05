package booklog;

import java.util.Date;

import book.Book;

public class BookLog {
	/* Create a class BookLog
	 * Add properties to this class : 
	 *    book object., checkOutDate object 
	 *    (*note java has a date object eg private Date checkOutDate;), returnDate object (type Date). 
	 * create a class CustomerProfile.
	 * Add properties to this class : 
	 *    customer object, 
	 *    an array of bookLog objects 
	 *    (representing all the books that have been 
	 *     checked in and out by this customer).
	 * Add an array of customerProfile objects to your Library class.
	 * Create methods to :
	 * 1. Add a single record to the customerProfile object
	 * 2. Add a single record to the bookLog object.
	 * 3. Update the bookLog object when a book is returned.
	 * **Hint where should you put each method ?
     *   How do you know if a book is returned.
     *   How do you know which customer returned a book.
     *   Do I need to override any additional methods like 
     *   equals() or compareTo() or toString()
	 */
	
	private Book book;
	private Date checkOutDate;
	
	public BookLog(Book book, Date date){
		this.book = book;
		this.checkOutDate = date;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
}
