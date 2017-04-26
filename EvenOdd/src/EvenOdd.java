import java.util.Scanner;


public class EvenOdd {
	public static void main(String[]args) {
		//define int value
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int i = input.nextInt();
		//check if it's even or odd
		System.out.print(i + " is an ");
		if(i%2 == 0){
			System.out.print("even");
		}else{
			System.out.print("odd");
		}
		System.out.println(" number.");
		input.close();
	}
}
