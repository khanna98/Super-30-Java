package strings;

import java.util.Scanner;

public class checkOccurance {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String s2 = sc.nextLine();
	
	void check() {
		if(s.contains(s2)) {
			System.out.println(s + " contains " + s2);
		}
		else {
			System.out.println(s + " doesn't contain " + s2);
		}
	}
	
	public static void main(String[] args) {
		checkOccurance obj = new checkOccurance();
		obj.check();
	}
}
