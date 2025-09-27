package HackerRank;

import java.util.Scanner;

 /* 
  * The first line contains an integer, , denoting the number of test cases.
Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

Output Format

For each input variable  and appropriate primitive , you must determine if the given primitives  data types are capable of storing it. If yes, then print:

n can be fitted in:
* dataType
 A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
  */

public class datatypes {

    public static void main(String []argh)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases" );
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x>= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)
                {
                    System.out.println("* byte");
                }

                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE)
                {
                    System.out.println("* short");
                }

                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
                
                {
                    System.out.println("* int");
                }

                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
                {
                    System.out.println("* long");
                }
                
            }

            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
sc.close();
    }
}

