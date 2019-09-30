
public class Main {

	public static void main(String[] args) {
		var numCount = 0;
		var sum = 0;
		for (var i = 1; i <= 1000; i++) {
			if (numCount < 5) {
				if (i % 3 == 0 && i % 5 == 0) {
					numCount++;
					System.out.println(i+" Matches");
					sum = sum + i;
				}				
			} else {
				System.out.println("The sum of the numbers is "+sum);
				break;
			}
		}

	}

}
