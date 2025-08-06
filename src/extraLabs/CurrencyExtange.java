package extraLabs;

public class CurrencyExtange {

	static Utils utils = new Utils();

	public static void main(String[] args) {
		int conversionAmount = utils.getInt("How much GBP would you like to convert? £");
		int conversionCurrency = utils.getInt("Conversion currency (1 = USD, 2 = EUR, 3 = JPY) ");
		String customerStatus = utils.getString("What type of customer are you? (R = Regular, V = VIP) ");
		
		double convertedCurrency = convetGBP(conversionCurrency, conversionAmount);
		double serviceFee = serviceFee(convertedCurrency);
		double tax = airportTax(customerStatus);
		
		double amount1 = conversionAmount * serviceFee;
		double amount2 = amount1 * tax;
		double amount3 = amount2 * convertedCurrency;
		
		System.out.printf("Amound after service fee = %f\nAmount after tax = %f\nFinal amount after currect exchange = %f", amount1, amount2, amount3);
	}

	static double convetGBP(int conversionCurrency, int conversionAmount) {
		double rate = 0;
		//String country = null;
		switch (conversionCurrency) {
		case 1:
//			country = "USA";
			rate = 1.25;
			break;
		case 2:
//			country = "EUR";
			rate = 1.15;
			break;
		case 3:
//			country = "JPY";
			rate = 180.50;
			break;
		default:
			System.out.println("Please enter a number between 1 - 3");
			break;
		}
		//System.out.printf("Contry = %s, Rate = %f", country, rate);
		return rate;
	}

	static double serviceFee(double conversionAmount) {
		double fee = 0;
		if (conversionAmount < 100) {
			fee = 1.5;
		} else if (conversionAmount >= 100) {
			fee = 2.5;
		}
		return fee;
	}

	static double airportTax(String customerStatus) {
		double tax = (customerStatus == "V") ? 1.1 : 1.5;

		return tax;
	}
}
