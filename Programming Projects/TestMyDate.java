package pkg4thqtritj;
import java.util.Scanner;
public class TestMyDate {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         MyDate d=  new MyDate ();
         d.day= 28; 
         d.month= 11;
         d.year= 2002;
         System.out.println("Date: "+d.month+" - "+d.day+" - "+ d.year );
         System.out.println(d.printMyDate());
         
         MyDate d2= new MyDate(28,11,2002);
         System.out.println(d2.printMyDate());
         d2.printMonth();
         
         MyDate d3= new MyDate(23, 8, 2001);
         System.out.println(d3.printMyDate());
         d3.printMyDate("November", 23, 2000);
         d3.printMyDate(23, "January", 2003);
    }
}
