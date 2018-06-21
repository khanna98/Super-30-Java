package dynamicArray;

public class FunctionsForDA {

	private int arr[];
	private static int n;

	public FunctionsForDA() {
		arr = new int[5];
	}

	public int size() {
		return n;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enlarge() {
		int[] array = arr;
		arr = new int[(int) (arr.length * 1.5)];
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}
	}

	public void push(int a) {
		if (n == arr.length) {
			enlarge();
		}
		arr[n] = a;
		n++;
	}

	public void set(int a, int b) {
		if (a > b) {
			throw new ArrayIndexOutOfBoundsException("Array Index is Out of Bounds");
		} else if (a == b) {
			push(b);
		} else {
			arr[a] = b;
		}
	}

	public int find(int a) {
		if (a < 0 || a >= n) {
			return -1;
		}
		return arr[a];
	}

	public int pop() {
		if (n < 1) {
			return -1;
		}
		int a = arr[n - 1];
		arr[n - 1] = 0;
		n++;
		return a;
	}

	public void display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
