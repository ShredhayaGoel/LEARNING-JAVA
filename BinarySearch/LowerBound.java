package BinarySearch;

import java.util.Scanner;

public class LowerBound {

    public static int lowerBound(int arr[], int x) {
        int left = 0;
        int right = arr.length;
                int ans = arr.length;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > x) {
                ans = mid;
                right = mid - 1;
            } else {
            left  = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("lower bound is at index: " + lowerBound(arr, 3));
        sc.close();
    }
}
