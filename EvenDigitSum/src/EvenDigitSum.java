
public class EvenDigitSum {
	
	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		int i = number;
		int sum = 0;
		while (i > 0) {
			if (i % 2 == 0) {
				sum += i % 10;
			}
			i /= 10;
		}
		return sum;
	}

}
