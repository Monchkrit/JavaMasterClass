
public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
		int compVal1 = (int) (val1 * 1000);
		int compVal2 = (int) (val2 * 1000);
		
		if (compVal1 == compVal2) {
			return true;
		}
		return false;
	}
}
