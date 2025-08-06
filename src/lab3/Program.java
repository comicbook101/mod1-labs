package lab3;

public class Program {
	
	static Utils utils = new Utils();
	
	public static void main(String[] args) {
		//getInt("What is your number?");
		//getString("What is your name?");
		
		//theLunchQueue();
		
		//convertInputToStonesPounds(getInt("What is the total weight in pounds? "));
		convertKgsToStonesPounds(utils.getInt("What is the weight in kg?" ));
	}
	
	public static void theLunchQueue() {
		Utils utils = new Utils();
		
		String mainCourse = utils.getString("What main dish would you like? (Fish, Burgers or Veg) ");
		int potatoes = utils.getInt("How many roast potatoes would you like? ");
		int brusselSprouts = utils.getInt("How many Brussel Sprouts would you like? ");
		
		System.out.printf("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts.", mainCourse, potatoes, brusselSprouts);
	}
	
	static void convertInputToStonesPounds(int pounds) {
		System.out.printf("You have %d pounds\n", pounds);
		double stones = (double)pounds / 14;
		//double remainder = stones % 14;
		System.out.printf("Which is: %f in stone.", stones);
	}
	
	static void convertKgsToStonesPounds(int kg) {
		System.out.printf("You have %d kg\n", kg);
		double kg1 = kg / 2.20462;
		
		convertInputToStonesPounds((int)kg1);
	}
}
