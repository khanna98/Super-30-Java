package strings;

import java.util.Scanner;

public class reverseString {
	public static void reverse(String s) {
		String newStr = "";
		for(int i=s.length()-1;i>=0;i--) {
			newStr = newStr + s.charAt(i);
		}
		System.out.println("The reverse string is " + newStr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		reverse(str);
	}

}
