package BinarySearch;

import java.util.Scanner;
public class sorted {

    public static int binarySearch(int arr[], int x){
        int lefft = 0; 
        int right = arr.length-1;
        while(lefft <= right){
            int mid = (lefft + right) /2;
            if(arr[mid] == x){

                System.out.println("Element found at index: " + mid);
                return mid;
            }
                else if(arr[mid] < x){
                    lefft = mid + 1;
                }
                else{
                    right = mid -1;
                }
                
            }
            System.out.println("Element not found");
            return -1;
        }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to perform binary search or 0 to exit:");
            int choice = sc.nextInt();
             if (choice == 1) {
              
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array"); 
         
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }   
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int result = binarySearch(arr, x);
        System.out.println(result);
    }
      if (choice == 0) {
                System.out.println("Exiting the program.");
                break;
            } else if 
            (choice != 1) {
                System.out.println("Invalid choice. Please enter 1 or 0.");
                continue;
            }
        }
        sc.close();
    }
}
