package PATTERNS;

import java.util.Scanner;

public  class insertionsort {

    public static void Insertionsort(int a[] , int n){
for(int i =0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1; i < n; i++){
          //  int temp = a[i];
            int j = i;
            while(j > 0 && a[j] < a[j - 1] ){
                int temp = a[j-1];
                a[j - 1] = a[j];
                a[j] = temp;    
                j--;
            }

}
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements:");
        
        Insertionsort(a);
        for( int val : a){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
