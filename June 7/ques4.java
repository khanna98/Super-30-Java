/*
* Question : Given three numbers a,b,c ,Write a java program to find the biggest ot of three numbers.
*/
import java.util.Scanner;
public class ques4{
    public static int isGreater(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        int ans = isGreater();
        System.out.println("The greatest among three is " + ans);
    }
}