package PATTERNS;
    import java.util.*;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> Map = new HashMap<>();
        for (int num : nums) {
            Map.put(num, Map.getOrDefault(num, 0) + 1);
        }

        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : Map.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }

        System.out.println("\nUnique elements with frequencies:");
        for (int[] pair : result) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }

        sc.close();
    }
}

    

