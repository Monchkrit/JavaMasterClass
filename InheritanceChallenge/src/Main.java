public class Main {

	public static void main(String[] args) {

		Car car = new Car(0, 0, 0, 4, 4, 1, 1);
		System.out.println("The car "+"has the "+car.getEngine()+" cylinder engine");
		System.out.println("The car has "+car.getTires()+" tires");
		Mercedes e300 = new Mercedes(0, 0, 0, 4, 4, 1, 1, 0, 0);
		System.out.println("The e300 "+" has the "+car.getGear()+" cylinder engine");
	}

}
