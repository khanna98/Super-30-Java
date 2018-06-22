package june21;

public class ques3 {

	public static <X> void printAll(X[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray = { 98, 56, 8, 2, 451, 3, 1 };
		Double[] doubleArray = { 98.8, 561.2, 7.5, 54.36, 1.0, 89.4, 75.8 };
		Character[] charArray = { 'm', 'a', 'y', 'n', 'k', 'h' };

		printAll(intArray);
		printAll(doubleArray);
		printAll(charArray);
	}

}
