package strings;

public class pattern {
	
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print((char)('a'+k-1) + " ");
			}
			System.out.println();
		}
	}
}
