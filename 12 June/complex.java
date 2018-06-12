import java.util.Scanner;

public class complex{
    int real;
    int imaginary;

    public void display(){
        if(imaginary<0){
            System.out.println("The complex number entered is : " + real + " " + imaginary + "i");
        }
        else{
            System.out.println("The complex number entered is : " + real + " + " + imaginary + "i");
        }
    }

    public static void main(String[] args){
        complex c = new complex();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        c.real = sc.nextInt();
        System.out.print("Enter the imaginary part: ");
        c.imaginary = sc.nextInt();
        c.display();
    }
}