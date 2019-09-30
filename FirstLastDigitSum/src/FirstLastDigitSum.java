
public class FirstLastDigitSum {
	
	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int i = number;
		int sum = i % 10;
		while(i >= 10) {
				i /= 10;
		}
		sum += i % 10;
		return sum;
	}

}
