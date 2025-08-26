package PATTERNS;
import java.util.Scanner;
public class armstrong {
    public static boolean isArmstrong(Scanner sc) {
int n = sc.nextInt();
int original = n;
int reversed = 0;
int count = String.valueOf(n).length();
 while(n > 0)
    {
        int dgt = n%10;
        reversed += (Math.pow(dgt,count)) ;
        n = n/10;
    }
    return original == reversed;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(isArmstrong(sc));
                System.out.println(isArmstrong(sc));
        System.out.println(isArmstrong(sc));

    }
}
