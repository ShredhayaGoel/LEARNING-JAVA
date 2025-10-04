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
         while (true) {
            System.out.println("Enter 1 to perform binary search or 0 to exit:");

            int choice = sc.nextInt();

             if (choice == 1) 
             {
        System.out.println("Enter the size of array");

        int n = sc.nextInt();

            System.out.println("Enter the elements of array");

        int arr[] = new int[n];

        for(int i =0; i <n; i++)
            {
            arr[i] = sc.nextInt();
        }
        System.out.println("lower bound is at index: " + lowerBound(arr, 3));
    }
      if (choice == 0) {
                System.out.println("Exiting the program.");

                break;
            } 
                 else if   (choice != 1)
                  {
                System.out.println("Invalid choice. Please enter 1 or 0.");
                
                continue;
            }
        }
        sc.close();
    }
}
