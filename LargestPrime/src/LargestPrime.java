public class LargestPrime {
	public static int getLargestPrime (int number) {
		if (number < 2)
			return -1;
		
		int checkPrime = number - 1;
		
		while (checkPrime > 1) {
			if (checkPrime == 2 && (number % 2 == 0)) {
				return 2;
			} else if (number % checkPrime == 0) {
					for (int i = checkPrime; i > 0; i--) {			
						for (int j = i - 1; j > 1; j--) {
							if (i % j == 0) {
								break;
							}	else if (j == 2) {
								if (number % i == 0)
								return i;
							}
						}
					}
				} 
					checkPrime--;
			}
		return number;
	}
}
