package BinarySearch;

// leetcode 35
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 


import java.util.Scanner;

public class searchinsertion {
    public static int searchInsert(int[] nums, int target) {
        int low =0; int high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
              else if(nums[mid] <= target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:"); 
        int n = sc.nextInt();
         System.out.println("Enter the elements of the array:");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){  
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();  
        int result = searchInsert(nums, target);
        System.out.println("The target should be inserted at index: " + result);
    }
}
