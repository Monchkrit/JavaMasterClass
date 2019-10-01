public class DiagonalStar {

	public static void printSquareStar(int number) {
		if (number < 5)
			System.out.println("Invalid Value");
		
		int rows = number;
		int columns = number;
		int spaces = 0;
		int stars = 0;
		
		while (rows >= 0) {
			if (rows == 0 || rows == columns) {
				for (int i = columns; i > 0; i--) {
					System.out.print("*");
					if (rows == 0 || rows == number) {
						System.out.print("*");
						System.out.println();
					}
				}
			}
			System.out.println();
			rows--;
		}
	}
}
