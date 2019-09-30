public class LargestPrime {

	public static int getLargestPrime (int number) {
		if (number < 0)
			return -1;		
		
		for (int i = number; i > 0; i--) {			
			for (int j = i - 1; j > 1; j--) {
				if (i % j == 0) {
					break;
				}
				else if (j == 2) {
					return i;
				}
			}
		}
		return -1;
	}
}
