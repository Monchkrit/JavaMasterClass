public class NumberToWords {
	
	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		int numCount = getDigitCount(number);
		System.out.println("There are "+numCount+" digits");
		int reversed = reverse(number);
		int printNum = 0;
		
		for (int i = 0; i < numCount; i++) {			
			printNum = reversed % 10;
			
			switch(printNum) {
			case 0:
				System.out.println("Zero");
				break;
			case 1: 
				System.out.println("One");
				break;
			case 2: 
				System.out.println("Two");
				break;
			case 3: 
				System.out.println("Three");
				break;
			case 4: 
				System.out.println("Four");
				break;
			case 5: 
				System.out.println("Five");
				break;
			case 6: 
				System.out.println("Six");
				break;
			case 7: 
				System.out.println("Seven");
				break;
			case 8: 
				System.out.println("Eight");
				break;
			case 9: 
				System.out.println("Nine");
				break;
			}			
			reversed /= 10;
		}
		
	}
	
	private static int reverse(int number) {
		int reversed = 0;
		
		if (number > -10 && number < 10) {
			reversed = number;
				return reversed;
		}
		
		int i = number;
		
		if (i < 0)
			i = -i;
		
		while (i > 0) {
			reversed *= 10;
			reversed = reversed + (i % 10);
			i /= 10;
		}
		if (number < 0) {
			reversed = -reversed;
		}
		return reversed;
	}

	private static int getDigitCount(int number) {
		if (number < 0)
			return -1;
		if (number == 0)
			return 1;
		
		int count = 0;
		int i = number;
		
		while (i > 0) {
			i /= 10;
				count ++;
			}
		return count;
	}
	
}
