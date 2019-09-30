
public class Main {

	public static void main(String[] args) {

		var sum = sumDigits(2869);
		System.out.println(sum);

	}
	
	public static int sumDigits(int number) {
		if (number < 10) {
			return -1;
		}
		var sum = 0;
		var i = number;
			while (i > 0) {
				sum = sum + (i % 10);
				i /= 10;
			}
		return sum;
	}

}
