package june21;

import java.util.Arrays;

public class ques2 {

	public static <X extends Comparable<X>> void mySort(X[] arr) {
		X n;
		X m;
		for (int i = 0; i < arr.length; i++) {
			m = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (m.compareTo(arr[j]) < 0) {
					n = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = n;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = { 98, 56, 8, 2, 451, 3, 1 };
		Double[] doubleArray = { 98.8, 561.2, 7.5, 54.36, 1.0, 89.4, 75.8 };
		Character[] charArray = { 'm', 'a', 'y', 'n', 'k', 'h' };

		mySort(intArray);
		mySort(doubleArray);
		mySort(charArray);

		String array1 = Arrays.toString(intArray);
		String array2 = Arrays.toString(doubleArray);
		String array3 = Arrays.toString(charArray);

		System.out.println(array1);
		System.out.println(array2);
		System.out.println(array3);
	}

}
