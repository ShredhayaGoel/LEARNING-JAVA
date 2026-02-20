package BinarySearch;


                                                        // leetcode 88
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

import java.util.Scanner;

public class merge {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n)

     {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0)
  {
    nums1[k] = nums2[j];
    j--;
    k--;
  }
  return nums1; 
   }
    public static void main(String[] args)

     {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the first array:");

        int m = sc.nextInt();

    System.out.println("Enter the size of the second array:");

        int n = sc.nextInt();

            System.out.println("Enter the elements of the first array:");

        int[] nums1 = new int[m + n];

        for(int i=0;i<m;i++)
        {
                nums1[i]=sc.nextInt();
    }
        System.out.println("Enter the elements of the second array:");

        int[] nums2 = new int[n];

        for(int i=0;i<n;i++)
        {

                nums2[i]=sc.nextInt();
    }
        int[] mergedArray = merge(nums1, m, nums2, n);

        System.out.println("The merged array is:");

        for(int i=0;i<mergedArray.length;i++)
        {
            System.out.print(mergedArray[i] + " ");
        }
}
}
    

