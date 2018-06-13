/*
* WAP to solve quadratic equations (using if,else if and else).
*/
import java.lang.Math;

public class ques2{
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 1;
        // Solving the roots of the equation
        float pAns = 0.0f, nAns;
        double determinant  = Math.pow(b,2)-4*a*c;
        pAns = (b*(-1) + Math.sqrt(determinant))/2*a;
        nAns = (b*(-1) - Math.sqrt(determinant))/2*a;
        System.out.println("The roots of the equation are " + pAns + " " + nAns);
    }
}