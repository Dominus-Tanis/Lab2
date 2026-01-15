package calculator;
import java.util.Scanner;

/**
 * This class defines a simple calculator that takes in two numbers, performs addition and subtraction, and 
 * returns the result
 * 
 * @author Jack B, Spencer Peck
 * 
 */
public class Calculator {

	public static void main(String[] args) {
		while(true) {
			//Take in two user numbers using Scanner
			Scanner scnr = new Scanner(System.in);
			System.out.println("Please enter an integer:");
			int number1 = scnr.nextInt();
			System.out.println("Please enter another integer:");
			int number2 = scnr.nextInt();
		
			//Perform addition and subtraction calculations
			int addition = number1 + number2;
			int subtraction = number1 - number2;
		
			//Display calculation results
			System.out.println("Addition Result: " + addition);
			System.out.println("Subtraction Result: " + subtraction);
			System.out.println("\n Run again? y\n");
			if(scnr.nextString() !="y") {break};
		}
		scnr.close();

	}

}
