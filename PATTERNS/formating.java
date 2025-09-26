package PATTERNS;

/*   Question on hackerrank   
In each line of output there should be two columns:
 The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/

    import java.util.Scanner;

public class formating {


    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                StringBuilder sb = new StringBuilder(s1);
            while (sb.length() < 15) {
                sb.append(" ");
            }
                
                String num = String.valueOf(x);
                while(num.length() < 3) {
                num = "0" + num;
            }
                System.out.println(sb.toString() + num);
            }
            System.out.println("================================");

            sc.close();

    }
}




    

