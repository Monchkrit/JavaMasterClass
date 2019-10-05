import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		var min = Integer.MAX_VALUE;
		var max = Integer.MIN_VALUE;
		var number = 0;

		System.out.println("Enter your first number ");
		var hasInt = scanner.hasNextInt();
		while (true) {
			if (hasInt) {
				number = scanner.nextInt();
				if (number > max) {
					max = number;
				} else if (number < min) {
					min = number;
				}
				System.out.println("Enter your next number ");
				hasInt = scanner.hasNextInt();
			} else {
				System.out.println("Invalid input");
				break;
			}
			scanner.nextLine();
		}
		System.out.println("The biggest number is "+max);
		System.out.println("The smallest number is "+min);
		scanner.close();
	}
}
