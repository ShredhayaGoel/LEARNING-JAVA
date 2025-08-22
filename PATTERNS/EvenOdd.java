package PATTERNS;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String [] ans = {"Even", "Odd"};
        System.out.println(ans[num % 2]);
        sc.close();

    }
    
}
