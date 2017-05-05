package book;

import customer.Customer;

public class Book {
	private String author;
	private String isbn;
	private String title;
	private int numberOfPages;
	private Customer isOut;
	
	public Book(){}
	
	public Book(String isbn, String title, String author, int numberOfPages){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Customer getIsOut() {
		return this.isOut;
	}
	public void setIsOut(Customer isOut) {
		this.isOut = isOut;
	}
	public String toString() { 
        return "\"" + this.getTitle() + "\" by " + this.getAuthor(); 
    } 

	//need equal
}
