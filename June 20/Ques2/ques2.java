import java.util.HashMap;

public class ques2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Greesh", 1);
        map1.put("Mayank", 2);
        map1.put("Suman", 3);
        map1.put("Sumant", 4);
        map1.put("Mayank", 5);

        System.out.println(map1);
        System.out.println("Map value for Mayank is " + map1.get("Mayank"));
    }
}