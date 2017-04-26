import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		/**Write a method to prompt the user 
		 * for 4 digits representing a year. 
		 * Then determine If Year Is a Leap Year. 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 4 digits representing a year: ");
		int year = input.nextInt();
		/**a year is a leap year if it is divisible by four, 
		 * UNLESS it is also divisible by 100. 
		 * A year is NOT a leap year if it is divisible by 100 
		 * UNLESS it is also divisible by 400. 
		 */
		String leap = " not ";
		if(year % 4 == 0){
			leap = " ";
			if(year % 100 == 0){
				leap = " not ";
				if(year % 400 == 0){
					leap = " ";
				}
			}
		}
		System.out.println(year + " is" + leap + "a leap year.");
		input.close();
	}

}
