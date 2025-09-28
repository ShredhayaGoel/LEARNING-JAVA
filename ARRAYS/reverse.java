package ARRAYS;

import java.util.*;
                                     // Question on hackerrank
                                 /*  Given an array, of size N, reverse it.*/

public class reverse {
    
    public static int[] reversearr(int arr[]){
        int n = arr.length;
     int rev [] = new int[n];
     for(int i =0; i < n; i++){
        rev[i] = arr[n-1-i];
     }   
     for(int j = 0 ; j < n; j++){
        System.out.print(rev[j]+ " ");
     }
     return rev;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
     int n  = sc.nextInt();
     int array[] = new int[n];
        System.out.println("Enter the elements of array");
     for(int i =0; i < n; i++){
        array[i] = sc.nextInt();
     }
     System.out.println("Reversed array is :");
      reversearr(array);   
     sc.close();
}
    }
