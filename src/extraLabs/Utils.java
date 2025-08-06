package extraLabs;

import java.util.Scanner;

public class Utils {
	
	Scanner txt = new Scanner(System.in);
	
	public int getInt(String prompt) {
		System.out.printf(prompt);
		int intAnswer = txt.nextInt();
		
		return intAnswer;
	}
	
	public String getString(String prompt) {
		System.out.printf(prompt);
		String stringAnswer = txt.next(); //Not txt.nextLine();
		
		return stringAnswer;
	}
}
