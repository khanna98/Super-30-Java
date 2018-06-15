package strings;

import java.util.Scanner;

public class removeVowels {
	
	public static String remVowel(String s) {
		String ans = "";
		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			if(a!='a' && a!='e' && a!='i' && a!='o' && a!='u' && a!='A' && a!='E' && a!='I' && a!='O' && a!='U') {
				ans+=a;
			}
		}		
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = remVowel(str);
		System.out.println("The string without vowels is " + s);
		// Pre-defined function for this :
		//System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
	}
}
