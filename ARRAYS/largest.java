package ARRAYS;
import java.util.Scanner;
public class largest {
    public static double Largest(double [] nums){
        double lar = nums[0];
        for(int i =1; i < nums.length; i++){

            if(nums[i] > lar){

                lar = nums[i];
            }
        }
        return lar;
    }
public static void main(String [] args){
    Scanner sc = new Scanner (System.in);

System.out.println("Enter the size of array");

    int n =sc.nextInt();
    double [] nums = new double [n];
    System.out.println("Enter the elements of array");
    for(int i =0; i < n ; i++){
        nums[i] = sc.nextDouble();
    }
    Largest(nums);
    System.out.println("The largest element in the array is " + Largest(nums));
    sc.close();
}
}