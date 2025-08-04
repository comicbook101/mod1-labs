package lab2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	
		Scanner txt = new Scanner(System.in);
		System.out.println("What did you score on the test? ");
		
		int userResult = txt.nextInt();
		
		if (userResult <= 50) {
			System.out.println("Failed");
		} 
		else if (userResult > 50 && userResult <= 60) {
			System.out.println("Passed");
		}
		else if (userResult > 60 && userResult <= 70) {
			System.out.println("Merit");
		}
		else if (userResult > 70 && userResult <= 100){
			System.out.println("Distinction");
		}
		else {
			System.out.println("Please enter a number between 1 - 100");
		}
		txt.close();
	}
	
}
