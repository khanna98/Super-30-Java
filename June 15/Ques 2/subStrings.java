package strings;

import java.util.Scanner;

public class subStrings {
	
	public static void subStr(String str) {
		int len = str.length();
		for(int i=0;i<=len;i++) {
			for(int j=0;j<=len-i;j++) {
				String sub = str.substring(j,j+i);
				System.out.println(sub);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		subStr(s);
	}
}
