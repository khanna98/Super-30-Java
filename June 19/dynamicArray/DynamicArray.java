package dynamicArray;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		FunctionsForDA dynamic = new FunctionsForDA();
		Scanner in = new Scanner(System.in);
		while (true) {
			int choice = 0;
			System.out.println("Please choose the operation for the Dynamic Array: ");
			System.out.println("1. Add an element ");
			System.out.println("2. Remove an element ");
			System.out.println("3. Find an element ");
			System.out.println("4. Check if it is empty ");
			System.out.println("5. Check the size of array ");
			System.out.println("6. Set an element");
			System.out.println("7. Display Array");
			choice = in.nextInt();
			if (choice == 0) {
				break;
			} else if (choice == 1) {
				System.out.print("Enter the element to add : ");
				int n = in.nextInt();
				dynamic.push(n);
			} else if (choice == 2) {
				dynamic.pop();
				System.out.print("Last element removed !");
			} else if (choice == 3) {
				System.out.print("Enter the element to find : ");
				int n = in.nextInt();
				dynamic.find(n);
			} else if (choice == 4) {
				if (dynamic.isEmpty()) {
					System.out.println("Array is Empty");
				} else {
					System.out.println("Array is not Empty");
				}
			} else if (choice == 5) {
				System.out.println("Size of array is " + dynamic.size());
			} else if (choice == 6) {
				System.out.print("Enter the element to set : ");
				int n = in.nextInt();
				System.out.print("Enter the index to set at : ");
				int m = in.nextInt();
				dynamic.set(m, n);
			} else if (choice == 7) {
				dynamic.display();
			}
			System.out.println("***********************");
		}
		// in.close();
	}
}
