package PATTERNS;
import java.util.Scanner;
public class Recursionsum {
    
public static int  recursion(int n)
{
    if(n ==0){
        return  0;
    }
        return n + recursion(n-1);
}
public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
           System.out.print("Enter a number: ");
    int n = sc.nextInt();

   int sum = recursion(n);
    System.out.println(sum);
    sc.close();
}
}
