package PATTERNS;
import java.util.Scanner;
public class NRecursion {
    public static void recursion(int n){
        if(n == 0){
            return ;
        }
        recursion(n-1);
        System.out.print(n+" ");

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");

        int n = sc.nextInt();


        recursion(n);
        System.out.println();
        sc.close();
    }
    
}
