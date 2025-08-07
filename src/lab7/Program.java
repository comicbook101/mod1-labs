package lab7;

import java.util.ArrayDeque;

public class Program {
	static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<ShoppingBasket>();
	
	public static void main(String[] args) {
		
		baskets.add(new ShoppingBasket());
		
		for(ShoppingBasket basket : baskets) {
			basket.add(new ShoppingBasketItem("Apple", 100, 10));
			basket.add(new ShoppingBasketItem("Computer", 1, 1000));
			basket.add(new ShoppingBasketItem("Monitor", 2, 50));
			basket.add(new ShoppingBasketItem("Keyboard", 1, 50));
			basket.add(new ShoppingBasketItem("MouseMat", 1, 10));
			basket.add(new ShoppingBasketItem("Mug", 2, 20));
		}
		
		processBaskets();
		
	}
	
	static void processBaskets() {
		int index = 0;
		for (ShoppingBasket basket : baskets) {
			System.out.println("Basket" + index);
			for (ShoppingBasketItem item : basket.basketItems) {
				System.out.println(item.getDetials());
			}
			System.out.println("");
			index++;
		}
	}
}