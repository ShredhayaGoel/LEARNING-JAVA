package PATTERNS;

import java.util.*;;
public class hashmap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        HashMap<Integer, Integer> MAP = new HashMap<>();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

                       MAP.put(num, MAP.getOrDefault(num, 0) + 1);

            System.out.println("After inserting " + num + ": " + MAP);
        }

        System.out.println("\nFinal frequencies:");
        for (Map.Entry<Integer, Integer> entry : MAP.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        sc.close();
    }
} 