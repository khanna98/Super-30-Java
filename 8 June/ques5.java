import java.util.Scanner;

public class ques5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0,rem;
        int num = n;
        while(n!=0){
            rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.println("The reverse of " + num + " is " + rev);
    }
}