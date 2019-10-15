public class Main {

	public static void main(String[] args) {

		Mercedes mercedes = new Mercedes("E300", "Medium");
		mercedes.steer(45);
		mercedes.accelerate(30);
		mercedes.accelerate(20);
		mercedes.accelerate(-45);
	}

}
