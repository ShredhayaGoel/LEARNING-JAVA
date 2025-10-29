package ARRAYS;

import java.util.Scanner;

public class slidingwindow {
    public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the size in array");

int n =sc.nextInt();

int [] arr = new int[n];
System.out.println("enter the elements in array");
for(int i =0; i < n;i++){
    arr[i] = sc.nextInt();
}
System.out.println("enter the sliding window size in array");

int s =sc.nextInt();
int arrsum =0;
int maxsum =0;

for(int i = 0; i < s; i++){ // s= 3
    arrsum += arr[i];
}
maxsum = arrsum;

for(int j =s; j < n; j++){
    arrsum+= arr[j]-arr[j-s];
if(arrsum > maxsum){
    maxsum = arrsum;
    System.out.println("sum is" +"  " +  maxsum  + "   for   " + (j - s + 1) + "  to  " + j);
}
}

  System.out.println(" final largset sum is" +"  " +  maxsum);
sc.close();
    }   
}
