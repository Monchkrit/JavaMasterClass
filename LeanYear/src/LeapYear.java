
public class LeapYear {
	public static boolean isLeapYear(int year) {
		if (year < 1 || year > 9999)
			return false;
			if (year % 4 != 0)
				return false;
				if (year % 100 == 0) {
					if (year % 400 != 0)
						return false;
				}
		return true;
	}
}
