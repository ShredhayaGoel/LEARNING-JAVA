package PATTERNS;

import java.util.Scanner;

public  class insertionsort {

    public static void Insertionsort(double a[] , int n){

        for(int i = 1; i < n; i++){
          //  int temp = a[i];
            int j = i;
            while(j > 0 && a[j] < a[j - 1] ){
                double temp = a[j-1];
                a[j - 1] = a[j];
                a[j] = temp;    
                j--;
            }     
}
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n = sc.nextInt();
        double  a[] = new double[n];
        

        System.out.println("Enter elements:");
        
        for(int i =0; i < n; i++){
            a[i] = sc.nextDouble();
        }

        Insertionsort(a,n);
        System.out.println("Sorted array:");
        for( double val : a){
            System.out.print(val + " ");
        }
        sc.close();
    }
}