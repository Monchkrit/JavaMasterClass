
public class Main {

	public static void main(String[] args) {

		var switchValue = 14;
		var charValue = 'f';
		var month = "feBRuary";
		
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		case 3:
			System.out.println("Value was 3");
			break;
		case 4:case 5:case 6:
			System.out.println("Value between 4 and 6");
			break;
		default:
			System.out.println("Was not 1 - 6");
			System.out.println("The output was actually "+switchValue);
			break;
		}

		switch(charValue) {
		case 'a':
			System.out.println("The value was a");
			break;
		case 'b':
			System.out.println("The value was b");
			break;
		case 'c':
			System.out.println("The value was c");
			break;
		default:
			System.out.println("The value was not a - c");
			break;
		}
		
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("January");
			break;
		case "february":
			System.out.println("February");
			break;
		case "march":
			System.out.println("March");
			break;
		default:
			System.out.println("The month is April to December");
			break;
		
		}
	}	
}
