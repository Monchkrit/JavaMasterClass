
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var hrMnSecs = getDurationString();
		System.out.println(hrMnSecs);
	}
	
	private static String getDurationString(int minutes, int seconds) {
		if (minutes < 0 || seconds < 0) {
			System.out.println("Invalid value");
		}
		int hours = minutes / 60;
		int mins = (seconds / 60) + (minutes % 60);
		int secs = getDurationString(seconds);
		
		if (hours > 10 && mins > 10 && secs > 10) {
			return (hours+"h "+mins+"m "+secs+"s");
			
		} else if (hours < 10 && mins > 10 && secs > 10) {
				return ("0"+hours+"h "+mins+"m "+secs+"s");
				
		} else if (hours < 10 && mins < 10 && secs > 10) {
				return ("0"+hours+"h "+"0"+mins+"m "+secs+"s");
				
		} else if (hours < 10 && mins < 10 && secs < 10) {
				return ("0"+hours+"h "+"0"+mins+"m "+"0"+secs+"s");
				
				
		} else if (hours > 10 && mins < 10 && secs > 10) {
				return (hours+"h"+"0"+mins+"m "+secs+"s");
					
		} else
				return (hours+"h"+mins+"m"+"0"+secs+"s");
	}
	
	private static int getDurationString(int seconds) {
		return (seconds % 60);
	}
}
