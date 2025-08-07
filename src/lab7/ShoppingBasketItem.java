package lab7;

public class ShoppingBasketItem {
	String productName;
	int quantity;
	double price;

	public ShoppingBasketItem(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}

	String getDetials() {
		String detials = ("Product Name = " + this.productName + " Quantity = " + this.quantity + " Price = £" + this.price);
		return detials;
	}
}
