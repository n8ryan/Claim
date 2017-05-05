package libApp;

import customer.Customer;
import customerProfile.CustomerProfile;
import library.Library;
import book.Book;
import branch.Branch;

public class MainApp {

	public static void main(String[] args) {
		//create branches
		Branch branch1 = new Branch("City");
		
		//create libraries
		Library library1 = new Library("North");
		
		//create books
		Book book1 = new Book("6485738902","My Great Book","Nathan Ryan",305);
		Book book2 = new Book("6445695902","Another Great Book","Jim Campbell",423);
		
		//create customers
		Customer cust1 = new Customer("Bill","456132");
		
		//create BookLogs
		
		//create CustomerProfiles
		
		//add libraries to branches
		branch1.addLibrary(library1);
		
		//add books to libraries
		library1.addBook(book1);
		library1.addBook(book2);
		
		//check out books
		CustomerProfile customerProfile = library1.getCustomerProfiles();
		for(int i = 1;i < library1.getCustomerProfiles().size(), i++{
			for(library1.getCustomerProfileslibrary1.getCustomerProfiles().iterator())
		}
					
		//print customer and books they have checked out
		System.out.println(cust1 + " has checked out the following books...");
		for( Book i : cust1.getBooksOut()){
			System.out.println("  " + i);
		}
	}

}
