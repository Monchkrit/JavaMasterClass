public class Vehicle {

	private int steer;	
	private int moving;
	
	public Vehicle() {
		this(0, 0);
	}
	public Vehicle(int steer) {
		this(steer, 0);
	}
	public Vehicle(int steer, int moving) {
		this.steer = steer;
		this.moving = moving;
	}
	
	public void turn(int steer) {
		switch(steer) {
		case -1:
			System.out.println("You are turning left.");
			break;
		case 0:
			System.out.println("You are going straight.");
			break;
		case 1:
			System.out.println("You are turning right.");
			break;
		default:
			break;
		}
	}
	public void moving(int speed) {
		System.out.println("The vehicle is moving "+speed);
	}
}
