/*
* Question: Check if a given year is a leap year or not.
*/

import java.util.Scanner;

public class ques2{
    public static boolean isLeap(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }        
    }
    public static void main(String[] args){
        boolean ans = isLeap();
        if(ans){
            System.out.println("The entered year is a Leap Year!");
        }
        else{
            System.out.println("The entered year is not a Leap Year!");
        }
    }
}