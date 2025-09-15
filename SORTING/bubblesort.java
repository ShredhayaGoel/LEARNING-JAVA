package SORTING;
import java.util.Scanner;
public class bubblesort {
    public static void Bubblesort(double a[], int n){
for(int i = 0; i < n - 1; i++){
    boolean swapped = false;
    for(int j = 0; j < n - i - 1; j++){
        if(a[j] > a[j+1]){
            double temp  = a[j];
            a[j] = a[j+1];
            a[j+1] =temp;
            swapped = true;
        }   
    }
    if(!swapped){
        return;
    }
}
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter Size of array :");
        int n = sc.nextInt();
        double  a[] = new double[n];
        System.out.println("Enter elements:");
        for(int i =0; i < n; i++){
            a[i] = sc.nextDouble();
        }
        Bubblesort(a, n);
        System.out.println("Sorted array:");
        for( double val : a){
            System.out.print(val + " ");
        }
        sc.close();
    }
}
