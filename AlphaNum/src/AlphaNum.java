import java.util.Scanner;


public class AlphaNum {

	public static void main(String[] args) {
		/**Write a method to prompt the user 
		 * for a letter of the alphabet and display it's numerical value. 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a letter of the alphabet: ");
		String s = input.next();
		int c = s.charAt(0);
		System.out.println("The letter " + s + " is ASCII value " + c + ".");
		
		input.close();


	}

}
