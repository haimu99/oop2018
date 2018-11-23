package week11;

public class Task2 {
	public static <T extends Comparable> T findMax(T[] inputArray){
		T max=inputArray[0];
		for (int i=0;i<inputArray.length;i++) {
			if(inputArray[i].compareTo(max)>0) {
				max=inputArray[i];
			}
		}
		return max;
	}
	public static void main(String args[]) {
		Integer[] intArray= {3,6,8,1,-9};
		System.out.println(findMax(intArray));
		Double[] doubleArray = { 1.5, 6.0, -0.5, 2.0, 7.0 };
		System.out.println(findMax(doubleArray));
	}
}
