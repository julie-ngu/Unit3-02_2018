/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Nov 2018
 * Created for: ICS4U
 * Recursive factorial program
 *
 ****************************************************************************/

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		System.out.print("Enter a positive integer: ");
		
		if(userInput.hasNextInt()) {
			int factNum = userInput.nextInt();
			
			if(factNum > 0) {
				int factAns = calculate(factNum);
				System.out.print("\nThe factorial of " + factNum + " is " + factAns + ".");
			}
			else {
				System.out.print("\nError");
			}
		}
		else {
			System.out.print("\nError");
		}
	}
	
	public static int calculate(int num) {
		// returns factorial of given number
		int result;
		
		if(num == 0) {
			result = 1;
			return result;
		}
		else {
			result = num * calculate(num - 1);
			return result;
		}
	}
}
