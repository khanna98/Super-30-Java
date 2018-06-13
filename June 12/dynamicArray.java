public class dynamicArray{
    public static void main(STring[] args){
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            if(i<arr.length){
                arr[i] = i+100;
            }
            else{
                arr = doubleArray(arr);
                arr[i] =  i+100;
            }
        }
    }
}