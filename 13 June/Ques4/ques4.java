import java.util.Scanner;

class longestIncreasingSubArray{
    static int lengthOflongest(int[] arr){
        int max = 1;
        int len = 1;
        for(int i=1;i<10;i++){
            if(arr[i]>arr[i-1]){
                len++;
            }
            else{
                if(max<len){
                    max = len;
                }
                len = 1;
            }
        }
        if(max < len){
            max = len;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 numbers of array : ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Length = " + lengthOflongest(arr));
    }
}