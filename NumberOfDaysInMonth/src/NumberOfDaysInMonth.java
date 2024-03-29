
public class NumberOfDaysInMonth {
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
	
	public static int getDaysInMonth(int month, int year) {
		if (isLeapYear(year) == false && year > 0 && year < 10000) {
			switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				return 31;
			case 2:
				return 28;	
			case 4:case 6:case 9:case 11:
				return 30;
			default:
				return -1;
			}
		} else if (isLeapYear(year) == true && year > 0 && year < 10000) {
			switch(month) {
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				return 31;
			case 2:
				return 29;
			case 4:case 6:case 9:case 11:
				return 30;
			default:
				return -1;
			}
		}else return -1;
	}
}
