package customerProfile;

import java.util.*;

import book.Book;
import booklog.BookLog;
import customer.Customer;

public class CustomerProfile {
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
	private Customer customer;
	private ArrayList<BookLog> bookLogs = new ArrayList<BookLog>();
	
	public CustomerProfile(){}
	public CustomerProfile(Customer customer, ArrayList<BookLog> bookLogs){
		this.customer = customer;
		this.bookLogs = bookLogs;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<BookLog> getBookLogs() {
		return bookLogs;
	}
	public void setBookLogs(ArrayList<BookLog> bookLogs) {
		this.bookLogs = bookLogs;
	}
	public void addToBookLogs(Book book, Date date){
		BookLog bl = new BookLog(book, date);
		this.bookLogs.add(bl);
	}
	public void removeFromBookLogs(BookLog booklog){
		this.bookLogs.remove(booklog);
	}
	public boolean equals(CustomerProfile other) {
	    if (other == null) {
	        return false;
	    }
	    if (!getCustomer().equals(other.getCustomer())) {
	        return false;
	    }
	   
	    return true;
	}
	
}
