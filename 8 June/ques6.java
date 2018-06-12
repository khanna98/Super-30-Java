public class ques6{
    public static void main(String[] args){
        int A[] = {1,1,1,1,0,0,1,0};
        for (int i = 0; i < A.length; i++){
            for (int j = i + 1; j < 8; j++){
                if (A[i] > A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}