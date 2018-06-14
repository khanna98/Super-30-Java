import java.util.Scanner;

class maxNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        
        if(a>b){
            System.out.println(a + " is greater than " + b);
        }
        else if(a<b){
            System.out.println(b + " is greater than " + a);
        }    
        else{
            System.out.println("Both are equal !");
        }
    }
}