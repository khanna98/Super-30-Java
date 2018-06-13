import java.util.Scanner;

public class ques7{
    public static void main(String[] args){
        int A[] = {1,4,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0;
        int last = 6;
        int mid = (first+last)/2;
        while(first<=last){
            if(A[mid]<n){
                first+=1;
            }
            else if(A[mid] == n){
                System.out.println("Number found at " + (mid+1) + " postion");
                break;
            }
            else{
                last = mid-1;
            }
            mid = (first+last)/2;
        }
        if(first>last){
            System.out.println("Number not found!");
        }
    }
}