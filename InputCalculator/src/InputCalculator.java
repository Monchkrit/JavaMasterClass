import java.util.Scanner;

public class InputCalculator {
	
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		
			boolean isInt = scanner.hasNextInt();
			int number1 = scanner.nextInt();
			int number2 = 0;
			int counter = 1;
			int sum = number1;
			int avg = 0;
			
			while(true) {
				if (isInt) {

					scanner.nextLine();
					isInt = scanner.hasNextInt();
					if (isInt) {
						number2 = scanner.nextInt();
						counter++;
						sum = sum + number2;
					}
				} else {
					break;
				}
			}
			
			avg = Math.round((long) sum / counter);
			System.out.println("SUM = "+sum+" AVG = "+avg);
			scanner.close();
	}
}
