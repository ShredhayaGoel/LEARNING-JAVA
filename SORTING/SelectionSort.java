package SORTING;
// selection sort
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
      public static int[] selectionSort(int[] nums) {
        int n = nums.length;
         for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
             for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
              int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }       
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] sorted = selectionSort(nums);

        System.out.println("Sorted array: " + Arrays.toString(sorted));
        sc.close();
    }
}

