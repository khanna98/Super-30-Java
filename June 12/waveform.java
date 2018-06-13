import java.util.Scanner;

public class waveform{
    public static void makeWaveform(int[] ans){
        for(int i=0;i<=ans.length;i=i+2){
            for(int j=i+1;j<ans.length;j++){
                int temp = ans[i];
                ans[i] = ans[i+1];
                ans[i+1] = temp;
            }
        }
        System.out.println("The waveform is :");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        makeWaveform(arr);
    }
}