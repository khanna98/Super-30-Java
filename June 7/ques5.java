/*
* Question : Check if a number N is a palindrome or not. 
*/
import java.util.Scanner;

public class ques5{
    public static boolean isPalindrome(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0,n,rem;
        n = num;
        while(n!=0){
            rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        if(rev==num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean ans = isPalindrome();
        if(ans){
            System.out.println("The entered number is a Palindrome!");
        }
        else{
            System.out.println("The entered number is not a Palindrome!");
        }    
    }
}