package ARRAYS;
import java.util.*;
public class sorted {
    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");    
        int n = sc.nextInt();
        int[] nums1 = new int[n];   
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }   


        System.out.println(isSorted(nums1));  // Output: true
        System.out.println(isSorted(nums1));  // Output: false
    
sc.close();
}
}

    

