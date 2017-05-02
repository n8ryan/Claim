import java.util.Scanner;


public class ChangeMaker {
	/** Given an amount of change from 1 to 99 cents
	 * return the optimum number of quarters, dimes,
	 * nickels, and pennies to give as change.
	 */
	public static void main(String[] args) {
		//Get user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount of change (1-99): ");
		int cents = input.nextInt();
		input.close();

		//call method to get coin amounts
		int[] coins = makeChange(cents);
		
		//Print out result
		System.out.print("Number of quarters given: " + coins[0] + "\n" +
				         "Number of dimes given: " + coins[1] + "\n" +
				         "Number of nickels given: " + coins[2] + "\n" +
				         "Number of pennies given: " + coins[3]);
		
	}
	public static int[] makeChange(int cents){
		/** Create an integer array with 4 values representing
		 * quarters, dimes, nickels and pennies in that order.
		 * Divide the parameter by 25 to get the number of quarters
		 * and place in an array.
		 * Mod by 25 to get the remaining change. Repeat with dimes(10), 
		 * nickels(5) and pennies(1), and place each value consecutively
		 * in the array.
		 */
		int[] change = new int[4];
		change[0] = cents/25 ;
		cents = cents % 25;
		change[1] = cents/10;
		cents = cents % 10;
		change[2] = cents/5;
		cents = cents % 5;
		change[3] = cents;
		return change;
	}
}
