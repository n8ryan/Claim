package library;

import java.util.*;

import customer.Customer;
import customerProfile.CustomerProfile;
import book.Book;
import booklog.BookLog;

public class Library {
	//Parameters
	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<CustomerProfile> customerProfiles = new ArrayList<CustomerProfile>();
	
	//Constructors
	public Library(){}
	
	public Library(String name){
		this.name = name;
	}
	public Library(String name, ArrayList<Book> books, ArrayList<Customer> customerList, ArrayList<CustomerProfile> customerProfiles){
		this.name = name;
		this.books = books;
		this.customers = customerList;
		this.customerProfiles = customerProfiles;
	}

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public ArrayList<CustomerProfile> getCustomerProfiles() {
		return customerProfiles;
	}
	public void setCustomerProfiles(ArrayList<CustomerProfile> customerProfiles) {
		this.customerProfiles = customerProfiles;
	}
	//Other Methods
	public void addBook(Book b){
		this.books.add(b);
	}
	public void removeBook(Book b){
		if(this.books.contains(b)){
			this.books.remove(b);
		}
	}
	public int bookCount(){
		int count = books.size();
		return count;
	}
	public void addCustomer(String name, String cardNumber){
		Customer customer = new Customer(name, cardNumber);
		this.customers.add(customer);
		addToCustomerProfiles(customer,null);
	}
	public void removeCustomer(Customer c){
		if(this.customers.contains(c)){
			this.customers.remove(c);
		}
	}
	public void addToCustomerProfiles(Customer customer, ArrayList<BookLog> bookLog){
		CustomerProfile customerProfile = new CustomerProfile(customer, bookLog);
		this.customerProfiles.add(customerProfile);
	}
	public void removeFromCustomerProfiles(String customerName){
		for(CustomerProfile cp : this.customerProfiles){
			if(cp.getCustomer().getName().equals(customerName)){
				this.customerProfiles.remove(cp);
				break;
			}
		}
		
	}
	public int customerCount(){
		int count = customers.size();
		return count;
	}
	public void checkOutBook(CustomerProfile customerProfile, Book book){ //need more
		customerProfile.addToBookLogs(book, new Date());
	}
	public void checkInBook(CustomerProfile customerProfile, Book book){
		ArrayList<BookLog> bookLogs = customerProfile.getBookLogs();
		for(BookLog bl : bookLogs){
			if(bl.getBook().equals(book)){
				bookLogs.remove(bl);
				break;
			}
		}
		if(bookLogs.contains(book)){
			bookLogs.remove(book);
		}
		
	}
}
