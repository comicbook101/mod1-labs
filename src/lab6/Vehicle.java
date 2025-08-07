package lab6;

public class Vehicle {
	int speed;
	int lane;
	int distanceTravelled;
	RegistrationPlate registrationPlate;

	public Vehicle(int lane) {
		this.lane = lane;
		this.registrationPlate.getNextRegistrationPlate();
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setLane(int lane) {
		this.lane = lane;
	}

	void accelerate(int amount) {
		if (amount > 200) {
			System.out.println("You cannot go faster than 200");
		} else {
			this.speed += amount;
			this.distanceTravelled += amount;
		}
	}

	void brake(int amount) {
		this.speed -= amount;
	}

	String getDetials() {
		String detials = "Speed = " + this.speed + "lane = " + this.lane + "distance travelled = "
				+ this.distanceTravelled;
		return detials;
	}
}
