
public class Mercedes extends Car {
	public String model;
	public int turbo;
	public int backupCamera;

	public Mercedes() {
		this("default", "default", 0, 4, 4, 2, 1, "default", 0, 1);
	}

	public Mercedes(String name, String size) {
		super(name, size);
	}

	public Mercedes(String name, String size, int gear, int tires, int engine, int doors, int trunk, String model,
			int turbo, int backupCamera) {
		super(name, size, gear, tires, engine, doors, trunk);
		this.model = model;
		this.turbo = turbo;
		this.backupCamera = backupCamera;
		
	}
//	
//	@Override
//	public void changeGears(int gear) {
//		switch(gear) {
//		case -1:
//			System.out.println("You are in reverse");
//			gear = -1;
//			break;
//		case 0:
//			System.out.println("You are in neutral");
//			gear = 0;
//			break;
//		case 1:
//			System.out.println("You are in first gear");
//			gear = 1;
//			break;
//		case 2:
//			System.out.println("You are in second gear");
//			gear = 2;
//			break;
//		case 3:
//			System.out.println("You are in third gear");
//			gear = 3;
//			break;
//		case 4:
//			System.out.println("You are in fourth gear");
//			gear = 4;
//			break;
//		}
//	}
}
