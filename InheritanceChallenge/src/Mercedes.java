
public class Mercedes extends Car {
	public String model;
	public int turbo;
	public int backupCamera;
	
	public Mercedes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mercedes(String name, String size) {
		super(name, size);
		// TODO Auto-generated constructor stub
	}

	public Mercedes(String name, String size, int tires, int engine, int doors, int trunk, boolean isManual, int gears) {
		super(name, size, tires, engine, doors, trunk, isManual, gears);
		// TODO Auto-generated constructor stub
	}
	
	public void accelerate(int rate) {
		int newVelocity = getCurrentVelocity() + rate;
		int change = newVelocity - getCurrentVelocity();
		if (newVelocity > 0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
		if (newVelocity == 0) {
			stop();
			changeGear(1);
		} else if (newVelocity > 0 && newVelocity <= 10) {
			if (change > 0) {
				changeGear(getCurrentGear() + 1);
			} else {
				changeGear(getCurrentGear() - 1);
			}
		} else if (newVelocity > 10 && newVelocity <= 20) {
			if (change > 0) {
				changeGear(getCurrentGear() + 2);
			} else {
				changeGear(getCurrentGear() - 2);
			}
		} else if (newVelocity > 20 && newVelocity <= 30) {
			if (change > 0) {
				changeGear(getCurrentGear() + 3);
			} else {
				changeGear(getCurrentGear() - 3);
			}
		} else if (newVelocity > 30)
			if (change > 0) {
			changeGear(getCurrentGear() + 4);
		} else {
			changeGear(getCurrentGear() - 4);
		}
		
	}
}
