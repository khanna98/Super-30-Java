import java.util.Scanner;

public class secondLargest{
    public static int large(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int num = a.length-2;
        return a[num];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);     
        System.out.print("Enter the number of elements to be added: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int ans = large(array);
        System.out.println("The second largest element is : " + ans);
    }
}