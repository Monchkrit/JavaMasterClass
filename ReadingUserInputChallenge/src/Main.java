import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		var i = 1;
		var sum = 0;
		var inputVal = 0;
		
		System.out.println("Enter number #1:");		
		var hasNextInt = scanner.hasNextInt();
		while (i < 11) {
			
			if (hasNextInt) {
				inputVal = scanner.nextInt();
				sum = sum + inputVal;
				i++;				
				if (i == 11)
					break;
				System.out.println("Enter number #"+i+":");
				hasNextInt = scanner.hasNextInt();
			} else {
				System.out.println("Unable to parse year of birth.");
				break;
			}
			scanner.nextLine();
		}

		System.out.println(sum);
		scanner.close();
	}
}