import java.util.Scanner;

/**Write a method to prompt the user to enter the radius of the circle
 then calculate the area and circumference of the circle.
 */
public class Circle {

	public static void main(String[] args) {
		
		double pi = 3.14159265359;
		System.out.println("Please enter the radius of a circle: ");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		double circumference = 2 * pi * radius;
		double circleArea = pi * radius * radius;
		System.out.println("For a circle with radius of " + radius + " :");
		System.out.println("The circumference is " + circumference + " and");
		System.out.println("the area is " + circleArea + ".");
		input.close();

	}

}
