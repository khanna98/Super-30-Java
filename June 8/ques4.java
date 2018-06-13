import java.util.Scanner;
import java.lang.Math;

public class ques4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(num!=0){
            num/=10;
            count++;
        }
        num = n;
        int rem,sum=0;
        while(num!=0){
            rem = num%10;
            sum += Math.pow(rem,count);
            num/=10;
        }
        if(sum == n){
            System.out.println(n + " is an armstrong number !");
        }
        else{
            System.out.println(n + " is not an armstrong number !");
        }
    }
}