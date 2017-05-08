package libApp;

import customer.Customer;
import customerProfile.CustomerProfile;
import library.Library;
import book.Book;
import booklog.BookLog;
import branch.Branch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
 
public class MainApp {

	public static void main(String[] args) {
		//create branches
		Branch branch1 = new Branch("City");
		Branch branch2 = new Branch("County");
		
		//create books
		Book book1 = new Book("0001","6485738902","My Great Book Pt 1","Nathan Ryan",305);
		Book book2 = new Book("0002","6445695902","Another Great Book Pt 1","Jim Campbell",423);
		Book book3 = new Book("0003","6485738903","My Great Book Pt 2","Nathan Ryan",305);
		Book book4 = new Book("0004","6445695903","Another Great Book Pt 2","Jim Campbell",423);
		Book book5 = new Book("0005","6485738904","My Great Book Pt 3","Nathan Ryan",305);
		Book book6 = new Book("0006","6445695904","Another Great Book Pt 3","Jim Campbell",423);
		Book book7 = new Book("0007","6485738905","My Great Book Pt 4","Nathan Ryan",305);
		Book book8 = new Book("0008","6445695905","Another Great Book Pt 4","Jim Campbell",423);
		Book book9 = new Book("0009","6485738906","My Great Book Pt 5","Nathan Ryan",305);
		Book book10 = new Book("00010","6445695907","Another Great Book Pt 5","Jim Campbell",423);
		Book book11 = new Book("00011","6485738908","My Great Book Pt 6","Nathan Ryan",305);
		Book book12 = new Book("00012","6445695909","Another Great Book Pt 6","Jim Campbell",423);
		Book book13 = new Book("00012","6485738900","My Great Book Pt 7","Nathan Ryan",305);
		Book book14 = new Book("00014","6445695901","Another Great Book Pt 7","Jim Campbell",423);
		Book book15 = new Book("00015","6485738912","My Great Book Pt 8","Nathan Ryan",305);
		Book book16 = new Book("00016","6445695922","Another Great Book Pt 8","Jim Campbell",423);
		Book book17 = new Book("00017","6485738932","My Great Book Pt 9","Nathan Ryan",305);
		Book book18 = new Book("00018","6445695942","Another Great Book Pt 9","Jim Campbell",423);
		Book book19 = new Book("00019","6485738952","My Great Book Pt 10","Nathan Ryan",305);
		Book book20 = new Book("00020","6445695962","Another Great Book Pt 10","Jim Campbell",423);
		
		//create customers
		Customer cust1 = new Customer("Chaz","456132");
		Customer cust2 = new Customer("Chaz2","456133");
		Customer cust3 = new Customer("Chaz3","456134");
		Customer cust4 = new Customer("Chaz4","456135");
		Customer cust5 = new Customer("Chaz5","456136");
		Customer cust6 = new Customer("Chaz6","456137");
		Customer cust7 = new Customer("Chaz7","456138");
		Customer cust8 = new Customer("Chaz8","456139");
		Customer cust9 = new Customer("Chaz9","456130");
		Customer cust10 = new Customer("Chaz10","456131");
		
		//create BookLogs
		Date d = new Date();
		BookLog booklog1 = new BookLog(book1, d);
		BookLog booklog2 = new BookLog(book2, d);
		BookLog booklog3 = new BookLog(book3, d);
		BookLog booklog4 = new BookLog(book4, d);
		BookLog booklog5 = new BookLog(book5, d);
		BookLog booklog6 = new BookLog(book6, d);
		BookLog booklog7 = new BookLog(book7, d);
		BookLog booklog8 = new BookLog(book8, d);

		//create booklog lists
		ArrayList<BookLog> bookLogList1 = new ArrayList<BookLog>(Arrays.asList(booklog1, booklog2));
		ArrayList<BookLog> bookLogList2 = new ArrayList<BookLog>(Arrays.asList(booklog3));
		ArrayList<BookLog> bookLogList3 = new ArrayList<BookLog>(Arrays.asList(booklog4, booklog5));
		ArrayList<BookLog> bookLogList4 = new ArrayList<BookLog>(Arrays.asList(booklog6));
		ArrayList<BookLog> bookLogList5 = new ArrayList<BookLog>(Arrays.asList(booklog7, booklog8));

		//create Customer Lists
		ArrayList<Customer> customerList1 = 
				new ArrayList<Customer>(Arrays.asList(cust1,cust2,cust3,cust4,cust5,cust6));
		ArrayList<Customer> customerList2 = 
				new ArrayList<Customer>(Arrays.asList(cust1,cust7,cust8,cust9,cust10,cust6));
		
		//create CustomerProfiles
		CustomerProfile cp1 = new CustomerProfile(cust1,bookLogList1);
		CustomerProfile cp2 = new CustomerProfile(cust2,bookLogList2);
		CustomerProfile cp3 = new CustomerProfile(cust3,bookLogList3);
		CustomerProfile cp4 = new CustomerProfile(cust4,bookLogList4);
		CustomerProfile cp5 = new CustomerProfile(cust5,bookLogList5);
		
		//create Book lists
		ArrayList<Book> bookList1 = 
				new ArrayList<Book>(Arrays.asList(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10));
		ArrayList<Book> bookList2 = 
				new ArrayList<Book>(Arrays.asList(book11,book12,book13,book14,book15,book16,book17,book18,book19,book20));
		
		//create CustomerProfile lists
		ArrayList<CustomerProfile> cpList1 = new ArrayList<CustomerProfile>(Arrays.asList(cp1,cp2,cp3));
		ArrayList<CustomerProfile> cpList2 = new ArrayList<CustomerProfile>(Arrays.asList(cp3,cp4,cp5));
		
		//create libraries 
		Library library1 = new Library("north",bookList1,customerList1,cpList1);
		Library library2 = new Library("south",bookList2,customerList2,cpList2);
				
		//add libraries to branches
		branch1.addLibrary(library1);
		branch2.addLibrary(library2);
		
		//add books to libraries
		library1.addBook(book1);
		library1.addBook(book2);
		
		//check out books
					
		//print customer and books they have checked out
		Customer c = 
		for(int i = 1; i < lib.getCustomers().size();i++){
			
		}
	}

}
