import java.util.Scanner;


public class RoundNum {

	public static void main(String[] args) {
		/**Write a method to prompt the user for a double 
		 * then display the value as a whole number. 
		 * eg user enter "15 .8" result is:  
		 * "You entered 15.8, the new value is 16".
		 * eg user enter "15 .4" result is:  
		 * "You entered 15.4, the new value is 15".
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a floating point number: ");
		double d = input.nextDouble();
		int i = (int)(d + .5);
		System.out.println("You entered " + d + ". the new value is " + i + ".");
		input.close();
                  
	}

}
