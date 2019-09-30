
public class NumberPalindrome {
	
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int i = number;
		int lastDigit = 0;
		if (i < 0) {
			i = -i;
		}
		while (i > 0) {
			lastDigit = i % 10;			
			reverse *= 10;
			reverse += lastDigit;
			i /= 10;
		}
		if (number < 0) {
			number = -number;
		}
		if (reverse == number) {
			return true;
		} else {
			return false;
		}
	}
}
