
public class EqualSumChecker {
	public static boolean hasEqualSum(int value1, int value2, int value3) {
		int firstSum = value1 + value2;
		
		if (firstSum == value3) {
			return true;
		}

		return false;
	}
}
