package book;

public class Book {
	private String author;
	private String isbn;
	private String title;
	private int numberOfPages;
	private String id;
	
	public Book(){}
	
	public Book(String id, String isbn, String title, String author, int numberOfPages){
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	public String toString() { 
        return "\"" + this.getTitle() + "\" by " + this.getAuthor(); 
    } 

	//need equal
	public boolean equal(Book other) {
	    if (other == null) {
	        return false;
	    }
	    if (this.id != other.id){
	        return false;
	    }
	   
	    return true;
	}
}
