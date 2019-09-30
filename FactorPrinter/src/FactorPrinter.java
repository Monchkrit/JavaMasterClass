
public class FactorPrinter {
	
	public static void printFactors(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		int checkNumber = 0;
		while (checkNumber <= number) {
			checkNumber++;
			if (number % checkNumber == 0) {
				System.out.println(checkNumber);				
			}
		}
	}
}
