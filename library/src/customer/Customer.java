package customer;


public class Customer {
	private String name;
	private String cardNumber;
	
	public Customer(){}
	public Customer(String name, String cardNumber){
		this.name = name;
		this.cardNumber = cardNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public ArrayList<Book> getBooksOut() {
		return booksOut;
	}
	public void setBooksOut(ArrayList<Book> booksOut) {
		this.booksOut = booksOut;
	}
	*/
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	//Methods
	public String toString() { 
        return this.getName();
    } 
	public boolean equals(Customer other) {
	    if (other == null) {
	        return false;
	    }
	    if (this.cardNumber != other.cardNumber){
	        return false;
	    }
	   
	    return true;
	}

}
