package BinarySearch;
public class UpperBound {
      public static int upperBound(int[] nums, int x) {
        int left = 0, right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 4, 5, 7, 9};
        int x = 4;
        int result = upperBound(nums, x);
        System.out.println("Upper bound of " + x + " is at index: " + result);
    }
}

