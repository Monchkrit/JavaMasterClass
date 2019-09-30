
public class SumOddRange {
	public static boolean isOdd(int number) {
		if (number < 1) {
			return false;
		} else if (number % 2 != 0) {
				return true;
		} else {
			return false;
		}
	}
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (start < 1 || end < 1 || start > end) {
			return -1;
		}
		for (int i = start; i <= end; i++) {
				if (isOdd(i) == true) {
					sum = sum + i;
				}
			}
		return sum;
	}
}
