import java.util.Scanner;


public class Triangle {
	/*Write a method to prompt the user for base-width and height of a triangle,
	  then calculate the area of the Triangle.
	*/

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the base-width of the triangle: ");
		double baseWidth = input.nextDouble();
		System.out.println("Please enter the height of the triangle: ");
		double height = input.nextDouble();
		double area = baseWidth * height / 2;
		System.out.println("The area of the triangle is: " + area);
		input.close();

	}

}
