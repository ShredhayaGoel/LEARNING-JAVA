package ARRAYS;
import java.util.*;
public class removeduplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;                 
                nums[i] = nums[j];   
            }
        }

        return i + 1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
         sc.close();
        int k = removeDuplicates(nums);
        
        System.out.println("k = " + k);
        System.out.print("Updated array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

    

