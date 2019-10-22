import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] intArray = getIntegers();
		int[] sortedArray = sortArray(intArray);
		System.out.println("sortedArray length is "+sortedArray.length);
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.println("The number in spot "+i+" is "+sortedArray[i]);
		}
	}
	
	public static int[] getIntegers() {
		int[] intArray = new int[5];

		System.out.println("Enter 5 values \r");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		return intArray;
	}
	
	public static int[] sortArray(int array[]) {
		int[] sortedArray = array;
		int low = 0;
		
		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = 0; j < sortedArray.length; j++) {
				if (sortedArray[i] > sortedArray[j]) {
					low = sortedArray[j];
					sortedArray[j] = sortedArray[i];
					sortedArray[i] = low;
				}
			}			
		}
		return sortedArray;
	}

}
