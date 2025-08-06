package lab4;

public class Program {

	static int[] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };

	static String[] names = { "George", "Mark", "Harry", "Will", "Lisa" };
	static int[] marks = { 100, 50, 10, 80, 90 };

	public static void main(String[] args) {
		System.out.println("Total = " + sum());
		System.out.println("Average = " + average());
		System.out.println("SmallestNumber = " + smallestNumber());
		System.out.println("BiggestNumber = " + biggestNumber());
		System.out.println("indexNumberZero = " + indexNumberZero());
		System.out.println("");
		
		for (int i = 0; i < marks.length && i < names.length; i++) {
			String grade = getGrade(marks[i]);
			String name = names[i];
			
			System.out.printf("%s got %s\n", name, grade);
		}
		
		System.out.println("It will take " + investment() + " years.");
		
		//System.out.println(multiplicationTable());
	}

	// Task 1 - done
	static int sum() {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	// Task 2 - done
	static int average() {
		int total = sum();

		int average = total / numbers.length;

		return average;
	}

	// Task 3 - done
	static int smallestNumber() {
		int smallestNumber = numbers[0];

		for (int number : numbers) {
			if (smallestNumber > number) {
				smallestNumber = number;

				return smallestNumber;
			}
		}
		return 0;
	}

	// Task 4 - done
	static int biggestNumber() {
		int max = numbers[0];
		int biggestNumber = 0;

		for (int number : numbers) {
			if (number > max) {
				biggestNumber = number;
			}
		}
		return biggestNumber;
	}

	// Task 5 - done
	static int indexNumberZero() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	static String getGrade(int mark) {
		if (mark <= 50) {
			return "Failed";
		} else if (mark > 50 && mark <= 60) {
			return "Passed";
		} else if (mark > 60 && mark <= 70) {
			return "Merit";
		} else if (mark > 70 && mark <= 100) {
			return "Distinction";
		} else {
			System.out.println("Please enter a number between 1 - 100");
		}
		return null;
	}
	
	static int investment() {
		int initialMoney = 100;
		int currentMoney = 0;
		double interestRate = 1.05;
		int years = 0;
		
		System.out.println("You initially invested = £" + initialMoney);
		currentMoney += initialMoney;
		
		do {
			years++;
			currentMoney *= interestRate;
			
			System.out.println("Years = " + years + " Current Money = £" + currentMoney);
		} while (currentMoney <= 200);
		
		return years;
	}
	
//	static int multiplicationTable() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			for (int a = 1; a <= 10; a++) {
//				System.out.printf("%d", i);
//			}
//		}
//		return 0;
//	}
}
