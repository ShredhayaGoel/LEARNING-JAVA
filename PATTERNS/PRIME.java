package PATTERNS;
import java.util.Scanner;
public class PRIME {
    public static boolean isPrime(Scanner sc){
    int n = sc.nextInt();
        if( n > 0 ){
      for(int i =2; i < n; i++){
        if(n%i ==0 ){
            return false;
        }
    }
    return true;
}
return false;
}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));
        System.out.println(isPrime(sc));


    }
    
}
