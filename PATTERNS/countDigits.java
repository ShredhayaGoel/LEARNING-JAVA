package PATTERNS;
import java.util.Scanner;
public class countDigits {
    public int countDigit(Scanner sc){
        int n = sc.nextInt();

if(n==0){
return 1;
}
int count =0;
n= Math.abs(n);
while(n>0){
    n = n/10;
    count++;
}
return count;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        countDigits s = new countDigits();
        System.out.println(s.countDigit(sc));
    }
}
    

