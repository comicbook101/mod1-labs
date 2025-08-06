package lab5;

public class Car {
	String make;
	int speed;
	
	public void start() {
		speed = 1;
	}
	
	public void accelerate(int amount) {
		speed += amount;
	}
	
	public void stop() {
		speed = 0;
	}
}
