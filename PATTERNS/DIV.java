package PATTERNS;
import java.util.Scanner;
public class DIV {
    public static void div(Scanner sc){
int n = sc.nextInt();
    System.out.print("Divisors of "+n+" are: "); 
    for(int i =1; i <= n; i++){
        if(n%i ==0 ){
            System.out.print(i+" ");
        }
    }
    System.out.println();
}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        div(sc);    
        div(sc); div(sc);    
        div(sc);div(sc);    
        div(sc);div(sc);    
        div(sc);div(sc);    
        div(sc);div(sc);    
        div(sc);div(sc);    
        div(sc);div(sc);
    }
}
