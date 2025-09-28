package HackerRank;

 import java.util.Scanner;
   /*    The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.
*/ 
public class EOF { 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int linenum  = 1;

    while (sc.hasNext()) {
        String line = sc.nextLine();
        System.out.println(linenum + " " + line);
        linenum++;
    }
        
    sc.close();
    
}
}
