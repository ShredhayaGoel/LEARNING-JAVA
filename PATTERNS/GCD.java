package PATTERNS;

public class GCD {
    public static int gcd(int a , int b){
        if(b==0){
            return a;
        }
        while(a > 0 && b >0){
          /*   if(a>b){
            int temp = b;
            b =  a%b;
            a = temp;
            return a;
        }
        else{
            int temp = a;
             = b%a;
            b = temp;
            return b;
        }
    }
    return 0;*/ 
    int temp = b;
        b = a%b;
        a = temp;
        }
        return a;
    }
    public static void main(String [] args){
        System.out.println(gcd(3,15));
    }
}
