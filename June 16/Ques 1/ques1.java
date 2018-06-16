package dynamicStorage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ques1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try {
			File f = new File("abc.txt");
			f.createNewFile();
			FileOutputStream o = new FileOutputStream(f);
			FileInputStream i = new FileInputStream(f);
			System.out.print("Enter paths of 5 files : ");
			String ans = "";
			for(int j=0;j<5;j++) {
				String s = sc.nextLine();
				ans += s + "\n";
			}
			for(int j=0;j<ans.length();j++) {
				o.write(ans.charAt(j));
			}
			int k;
			while((k=i.read())!=-1) {
				System.out.print((char)k);
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
}
