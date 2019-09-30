
public class Main {

	public static void main(String[] args) {
		var dayOfWeek = 2;
		System.out.println(DayOfTheWeek.printDayOfTheWeek(dayOfWeek));
		
		if (dayOfWeek < 1 || dayOfWeek > 7)
			System.out.println("Not a day of the week");
		if (dayOfWeek == 1)
			System.out.println("Monday");
		if (dayOfWeek == 2)
			System.out.println("Tuesday");
		if (dayOfWeek == 3)
			System.out.println("Wednsday");
		if (dayOfWeek == 4)
			System.out.println("Thursday");
		if (dayOfWeek == 5)
			System.out.println("Friday");
		if (dayOfWeek == 6)
			System.out.println("Saturday");
		if (dayOfWeek == 7)
			System.out.println("Sunday");
	}

}
