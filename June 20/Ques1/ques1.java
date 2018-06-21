import java.util.HashSet;

public class ques1{
    public static void main(String[] args) {
        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        for(int i=0;i<10;i++){
            one.add(i);
        }
        for(int i=0;i<10;i+=2){
            two.add(i);
        }
        System.out.println("Contents of HashSet one : " + one);
        System.out.println("Contents of HashSet two : " + two);
        one.retainAll(two);
        System.out.println("Retaining same elements : " + one);
    }
}