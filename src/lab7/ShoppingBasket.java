package lab7;

import java.util.ArrayList;

public class ShoppingBasket {
	ArrayList<ShoppingBasketItem> basketItems = new ArrayList<>();

	void add(ShoppingBasketItem item) {
		basketItems.add(item);
	}
}
