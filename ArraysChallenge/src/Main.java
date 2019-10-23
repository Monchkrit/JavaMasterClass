import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] intArray = getIntegers();
		int[] sortedArray = sortArray(intArray);
		printArray(sortedArray);
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
		int[] sortedArray = Arrays.copyOf(array, array.length);
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
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println("Number at position "+i+" is "+array[i]);
		}
	}
}