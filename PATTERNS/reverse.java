package PATTERNS;

import java.util.Scanner;
public class reverse {
    public int reverseNumber(Scanner sc) {
        int n = sc.nextInt();

        if(n==0){
            return 0;
        }
         int rev = 0;

      n = Math.abs(n);

      while(n > 0){
        int dgt = n%10;
        n = n/10;
        rev = (rev * 10) + dgt;
      }
      return rev;
        }  
         public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            reverse no = new reverse();
            System.out.println(no.reverseNumber(sc));
            sc.close();
         }
        }

