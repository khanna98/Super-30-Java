/*
* Question : Take two numbers a and b, and add them. Print the sum on the screen.
*/
import java.util.Scanner;

public class ques1{
    public static int addNumbers(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        return c;
    }
    public static void main(String[] args){
        int ans = addNumbers();
        System.out.println("The sum of the number is " + ans);
    }
}
