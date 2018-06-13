/*
* Question : Find the reverse of a number.
*/
import java.util.Scanner;

public class ques7{
    public static int reverse(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,n,rem;
        n = num;
        while(n!=0){
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        int ans = reverse();
        System.out.println("The reverse of the entered number is " + ans);
    }
}