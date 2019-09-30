
public class Main {

	public static void main(String[] args) {
		int newScore = calculateScore("Donny", 500);
		System.out.println("New score is "+newScore);
		calculateScore(75);
		calculateScore();
		calcFeetAndInchesToCentimeters(6, 2);

	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+playerName+" scored "+score+" points!");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player "+ "scored "+score+" points!");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("Unnamed player no player score");
		return 0;
	}
	
	public static void calcFeetAndInchesToCentimeters(double feet, double inches) {
		if (feet >= 0 && inches >= 0) {
			var feetInches = feet * 12;
			var totalInches = feetInches + inches;
			System.out.println("There are "+calcFeetAndInchesToCentimeters(totalInches)+
					" centimeters in the measurement.");
		}
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		var centimeters = inches * 2.54;
		return centimeters;
	}
}
