
public class BarkingDog {
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23) {			
			return false;
		} else if (isBarking == false) {
			return false;
		} else if (isBarking == true && (hourOfDay < 8 || hourOfDay > 22)) {
			return true;
		} else {
			return false;
		}
	}
}
