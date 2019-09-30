
public class SharedDigit {
	
	public static boolean hasSharedDigit(int num1, int num2) {
		if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
			return false;
		}
		
		int i1 = num1;
		int i2 = num2;
		while (i1 > 0) {
			if ((i1 % 10) == (i2 % 10)) {
				return true;
			}
			i2 = num2;
			while (i2 > 0) {
				if ((i1 % 10) == (i2 % 10)) {
					return true;
				}				
				i2 /= 10;
			}
			i1 /= 10;
		} 
		return false;
	}
}
