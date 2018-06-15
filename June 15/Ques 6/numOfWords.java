package strings;

import java.util.Scanner;

public class numOfWords {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	void words() {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				count++;
			}
		}
		count+=1;
		System.out.println("There are " + count + " words in the sentence.");
	}
	
	public static void main(String[] args) {
		numOfWords n = new numOfWords();
		n.words();
	}
}
