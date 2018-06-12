import java.util.Scanner;

public class rectangle{
    private int length;
    private int breadth;

    rectangle(int a,int b){
        length = a;
        breadth = b;
    }
    
    public void areaRectangle(){
        int area = length*breadth;
        System.out.println("The area of the recatngle is " + area);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b = sc.nextInt();
        rectangle r = new rectangle(l,b);
        r.areaRectangle();
    }

}