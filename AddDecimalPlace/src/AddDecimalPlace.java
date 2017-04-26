import java.util.Scanner;


public class AddDecimalPlace {

	public static void main(String[] args) {
		/**Write a method to prompt the user for an Integer
		 *  then display the same value  with one decimal place. 
		 *  eg user enter "15 " result is: "You entered 15, the new value is 15.0"
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int i = input.nextInt();
		double d = (double)i;
		System.out.println("You entered " + i + ". The new value is " + d);
		
		input.close();

	}

}
