
public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int first, int second) {

		if (first < 10 || second < 10) {
			return -1;
		}

		int div1 = first;
		int div2 = second;
		int commonDenominator = 1;
				
		if (first > second) {
			div1 = second;
			div2 = first;
		} else if (second > first) {
			div1 = first;
			div2 = second;
		}
		if (div1 == div2) {
			return div1;
		}
		for (int i = 1; i <= second; i++) {			
			if ((div1 % i == 0) && (div2 % i == 0)) {
				commonDenominator = i;
			}
		}
		return commonDenominator;
	}
}
