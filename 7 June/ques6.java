/*
* Question : Check if a number is prime or not.
*/
import java.util.Scanner;

public class ques6{
    public static boolean isPrime(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args){
        boolean ans = isPrime();
        if(ans){
            System.out.println("The entered number is a Prime number!");
        }
        else{
            System.out.println("The entered number is not a Prime number!");
        }
    }
}