
public class Main {

	public static void main(String[] args) {

//		var count = 0;
//		while(count != 5) {
//			System.out.println("Count value is "+count);
//			count++;
		var number = 4;
		var finishNumber = 20;
		var count = 0;
		
		while (number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number "+number);
			count++;
			if (count == 5)
				break;
		}
		System.out.println("There are "+count+" even numbers");
	}
		
	public static boolean isEvenNumber(int number) {
			if(number % 2 == 0) {
				return true;
			} else {
				return false;
			}
		} 
	}
