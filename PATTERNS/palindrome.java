package PATTERNS;

import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(Scanner sc){ 

        int num = sc.nextInt();
         if(num < 0){
            return false;
         }
        int original = num;
        int rev =0;
        while(num > 0){
            int dgt = num%10;
            rev =(rev*10 ) + dgt;
            num = num/10;
        }
        return original == rev;
        }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //  palindrome no = new palindrome();
        System.out.println(isPalindrome(sc));
        System.out.println(isPalindrome(sc));
    }
    
}
