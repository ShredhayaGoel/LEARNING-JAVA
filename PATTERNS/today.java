package PATTERNS;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class today {
    public static void main(String[] args) {
       LocalDateTime mydate = LocalDateTime.now();  
              LocalDate mdate = LocalDate.now();  
System.out.println(mdate);
         System.out.println(mydate);
         int day = mydate.getDayOfMonth();
            int month = mydate.getMonthValue();
            int year = mydate.getYear();
            System.out.println("Date: " + day + "/" + month + "/" + year);
    }
    
}
