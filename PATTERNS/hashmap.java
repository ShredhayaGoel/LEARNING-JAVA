package PATTERNS;
import java.util.*;
public class hashmap {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the number of key value pairs");   
    int n =sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<n;i++){
        System.out.println("Enter the key ");
        int key = sc.nextInt();
                    System.out.println("Enter the value ");
        int value = sc.nextInt();
                    map.put(key,value);

    }
    map.put(1,2);
    map.put(2,3);
System.out.println(map);
System.out.println(map);

    System.out.println(map.get(1));
            System.out.println(map.get(2));
    System.out.println(map.containsKey(1));
    System.out.println(map.containsKey(3));
    sc.close();

}
}
