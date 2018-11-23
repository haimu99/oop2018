package week11;

public class Task1 {
	public static <T extends Comparable> void sort(T[] inputArray) {
		// sap xep
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++)
				if (inputArray[i].compareTo(inputArray[j]) > 0) {
					T x = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = x;
				}
		}

	}

	// in mảng
	public static <T> void printArray(T[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

	public static void main(String args[]) {
		Integer[] intArray = { 5, 1, 8, 9, 3 };
		sort(intArray);
		printArray(intArray);
		Double[] doubleArray = { 1.5, 6.0, -0.5, 2.0, 7.0 };
		sort(doubleArray);
		printArray(doubleArray);

	}
}
